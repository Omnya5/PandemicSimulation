package pl.strzygowska.pandemicsimulation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.strzygowska.pandemicsimulation.model.PandemicDay;
import pl.strzygowska.pandemicsimulation.model.Simulation;
import pl.strzygowska.pandemicsimulation.service.PandemicDayService;
import pl.strzygowska.pandemicsimulation.service.SimulationService;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.*;

@Controller
public class SimulationController {

    @Autowired
    private SimulationService simulationService;

    @Autowired
    private PandemicDayService pandemicDayService;

    @RequestMapping(value = "createSimulation", method = RequestMethod.GET)
    @ResponseBody
    public List<PandemicDay> createSimulation(ModelAndView mv,
                                              @Valid @RequestParam(name = "N") String N,
                                              @Valid @RequestParam(name = "P") Long P,
                                              @Valid @RequestParam(name = "I") Long I,
                                              @Valid @RequestParam(name = "R") String R,
                                              @Valid @RequestParam(name = "M") String M,
                                              @Valid @RequestParam(name = "Ti") Integer Ti,
                                              @Valid @RequestParam(name = "Tm") Integer Tm,
                                              @Valid @RequestParam(name = "Ts") Integer Ts,
                                              BindingResult result) {
        List<PandemicDay> pandemicDays;
        if (!result.hasErrors()) {
            Simulation s = simulationService.createSimulation(N, P, I, Float.parseFloat(R), Float.parseFloat(M), Ti, Tm, Ts);
            pandemicDayService.generatePandemicDays(s);
            pandemicDays = pandemicDayService.getPandemicDaysForSimulation(s);
        } else {
            pandemicDays = new ArrayList<>();
        }
        return pandemicDays;
    }

    @RequestMapping(value = "getSimulation", method = RequestMethod.GET)
    @ResponseBody
    public List<PandemicDay> getSimulation(@RequestParam(name = "N") String N) {
        Simulation s = simulationService.getSimulationByName(N);
        List<PandemicDay> pandemicDays = pandemicDayService.getPandemicDaysForSimulation(s);
        return pandemicDays;
    }
}
