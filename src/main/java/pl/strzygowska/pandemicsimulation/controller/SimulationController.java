package pl.strzygowska.pandemicsimulation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.strzygowska.pandemicsimulation.model.Simulation;
import pl.strzygowska.pandemicsimulation.service.PandemicDayService;
import pl.strzygowska.pandemicsimulation.service.SimulationService;

@Controller
public class SimulationController {

    @Autowired
    private SimulationService simulationService;

    @Autowired
    private PandemicDayService pandemicDayService;

    @RequestMapping(value = "createSimulation", method = RequestMethod.GET)
    public ModelAndView createSimulation(ModelAndView mv,
                                         @RequestParam(name = "N") String N,
                                         @RequestParam(name = "P") Long P,
                                         @RequestParam(name = "I") Long I,
                                         @RequestParam(name = "R") String R,
                                         @RequestParam(name = "M") String M,
                                         @RequestParam(name = "Ti") Integer Ti,
                                         @RequestParam(name = "Tm") Integer Tm,
                                         @RequestParam(name = "Ts") Integer Ts){
        Simulation s = simulationService.createSimulation(N, P, I, Float.parseFloat(R), Float.parseFloat(M), Ti, Tm, Ts);
        pandemicDayService.generatePandemicDays(s);
        return mv;
    }
}
