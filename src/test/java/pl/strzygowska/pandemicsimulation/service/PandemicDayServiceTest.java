package pl.strzygowska.pandemicsimulation.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.strzygowska.pandemicsimulation.model.PandemicDay;
import pl.strzygowska.pandemicsimulation.model.PandemicDayDAO;
import pl.strzygowska.pandemicsimulation.model.Simulation;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@Transactional
class PandemicDayServiceTest {

    @Autowired
    private PandemicDayService service;

    @Autowired
    private SimulationService simulationService;

    @Autowired
    private PandemicDayDAO pandemicDayDAO;

    @Test
    void createPandemicDayTest() {

    }

    @Test
    void generatePandemicDays() {
        try {
            Simulation s = simulationService.createSimulation("name", 1000l, 2l, 1.5f, 0.1f, 5, 3, 20);
            service.generatePandemicDays(s);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        assertTrue(pandemicDayDAO.count() > 0);
    }
}