package pl.strzygowska.pandemicsimulation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.strzygowska.pandemicsimulation.model.PandemicDay;
import pl.strzygowska.pandemicsimulation.model.PandemicDayDAO;
import pl.strzygowska.pandemicsimulation.model.Simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PandemicDayService {

    @Autowired
    private PandemicDayDAO pandemicDayDAO;

    private long newInfected;
    private long newDead;
    private long newRecovered;

    public PandemicDay createPandemicDay(Simulation simulation, Long Pi, Long Pv, Long Pm, Long Pr) {
        PandemicDay pandemicDay = new PandemicDay(simulation, Pi, Pv, Pm, Pr);
        pandemicDayDAO.save(pandemicDay);
        simulation.getPandemicDays().add(pandemicDay);
        return pandemicDay;
    }

    private PandemicDay getFirstPandemicDay(Simulation simulation) {
        return createPandemicDay(simulation, simulation.getI(), simulation.getP() - simulation.getI(), 0L, 0L);
    }

    public void generatePandemicDays(Simulation simulation) {
        Map<Integer, Long> infectedByDay = new HashMap<>();
        Map<Integer, Long> deadByDay = new HashMap<>();
        PandemicDay firstDay = getFirstPandemicDay(simulation);
        long pi = firstDay.getPi();
        long pv = firstDay.getPv();
        long pm = firstDay.getPm();
        long pr = firstDay.getPr();
        long p = simulation.getP();
        float m = simulation.getM();
        float r = simulation.getR();
        int ti = simulation.getTi();
        int tm = simulation.getTm();
        infectedByDay.put(0, pi);
        deadByDay.put(0, pm);
        for (int numberOfDay = 1; numberOfDay < simulation.getTs(); numberOfDay++) {
            newDead = 0;
            newInfected = 0;
            newRecovered = 0;
            if (numberOfDay >= tm) {
                newDead = (long) (m * infectedByDay.get(numberOfDay - tm));
            }
            deadByDay.put(numberOfDay, newDead);
            if (r > 0) {
                newInfected = (long) (pi * r);
            }
            if(newInfected > pv){
                newInfected = pv;
            }
            infectedByDay.put(numberOfDay, newInfected);
            if (ti > tm && numberOfDay >= ti) {
                newRecovered = (long) infectedByDay.get(numberOfDay - ti) - deadByDay.get(numberOfDay - (ti - tm));
            }
            pm += newDead;
            pr += newRecovered;
            pi = pi - newDead - newRecovered + newInfected;
            pv = p - pm - pi - pr;
            if (pv < 0) {
                pv = 0;
            }
            if ((pm + pr) > p) {
                break;
            }
            createPandemicDay(simulation, pi, pv, pm, pr);
        }
    }

    public List<PandemicDay> getPandemicDaysForSimulation(Simulation simulation) {
        return pandemicDayDAO.findAllBySimulation(simulation);
    }
}