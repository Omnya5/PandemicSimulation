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

    public PandemicDay createPandemicDay(Simulation simulation, Long Pi, Long Pv, Long Pm, Long Pr){
        PandemicDay pandemicDay = new PandemicDay(simulation, Pi, Pv, Pm, Pr);
        pandemicDayDAO.save(pandemicDay);
        return pandemicDay;
    }

    private PandemicDay getFirstPandemicDay(Simulation simulation){
        return createPandemicDay(simulation, simulation.getI(), simulation.getP()- simulation.getI(), 0l, 0l);
    }

    public void generatePandemicDays(Simulation simulation){
        Map<Integer, Long> deadByDay = new HashMap<>();
        Map<Integer, Long> infectedByDay = new HashMap<>();
        PandemicDay firstDay = getFirstPandemicDay(simulation);
        long pi = firstDay.getPi();
        long pv = firstDay.getPv();
        long pm = firstDay.getPm();
        long pr = firstDay.getPr();
        float m = simulation.getM();
        float r = simulation.getR();
        int ti = simulation.getTi();
        int tm = simulation.getTm();
        deadByDay.put(0, pm);
        infectedByDay.put(0, pi);
        for (int numberOfDay = 1; numberOfDay <= simulation.getTs(); numberOfDay++) {
            newDead = 0;
            newInfected = 0;
            newRecovered = 0;
            if (numberOfDay >= tm) {
                newDead = (long) (m * infectedByDay.get(numberOfDay - tm)); //TODO: if numberOfDay >= tm
            }
            deadByDay.put(numberOfDay, newDead);
            if (r > 0){
                newInfected = (long) (pi * r); //TODO: r > 0 w walidacji
            }
            infectedByDay.put(numberOfDay, newInfected);
            if(ti > tm && numberOfDay >= ti){
                newRecovered = (long) infectedByDay.get(numberOfDay - ti) - deadByDay.get(numberOfDay - (ti - tm)); //TODO: Ti > Tm, numberOfDay >= ti
            }
            pm += newDead;
            pr += newRecovered;
            pi += newInfected;
            pv = pv - newDead - newRecovered - newInfected;//TODO: pm + pi + pr + pv = P
            if (pv < 0){
                break;
            }
            createPandemicDay(simulation, pi, pv, pm, pr);
        }
    }


    
}
