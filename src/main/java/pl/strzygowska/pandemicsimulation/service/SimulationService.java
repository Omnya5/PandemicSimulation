package pl.strzygowska.pandemicsimulation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.strzygowska.pandemicsimulation.model.PandemicDay;
import pl.strzygowska.pandemicsimulation.model.Simulation;
import pl.strzygowska.pandemicsimulation.model.SimulationDAO;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationService {

    @Autowired
    private SimulationDAO simulationDAO;

    public List<PandemicDay> getPandemicDays(Simulation simulation){
        // TODO: implement logic
        return new ArrayList<PandemicDay>();
    }

    public void createPandemicDays(Integer Ts){
        for (int i = 0; i < Ts; i++) {

        }
    }

    public Simulation createSimulation(String N, Long P, Long I,
                                 Float R, Float M, Integer Ti, Integer Tm, Integer Ts){
        Simulation simulation = new Simulation(N, P, I, R, M, Ti, Tm, Ts);
        simulationDAO.save(simulation);
        return simulation;
    }
}


