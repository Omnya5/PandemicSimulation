package pl.strzygowska.pandemicsimulation.service;

import org.junit.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TestTransaction;
import pl.strzygowska.pandemicsimulation.model.PandemicDay;
import pl.strzygowska.pandemicsimulation.model.PandemicDayDAO;
import pl.strzygowska.pandemicsimulation.model.Simulation;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
class PandemicDayServiceTest {

    @Autowired
    private PandemicDayService service;

    @Autowired
    private SimulationService simulationService;

    @Autowired
    private PandemicDayDAO pandemicDayDAO;

    @AfterEach

    @Test
    void createPandemicDayTest() {

    }

    @Test
    @Transactional
    void testIfCreateCorrectSimulation() {
        try {
            Simulation s = simulationService.createSimulation("ble", 10000L, 2L, 1.5f, 0.03f, 10, 8, 10);
            service.generatePandemicDays(s);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        assertEquals(10, simulationService.getSimulationByName("ble").getPandemicDays().size());
    }

    @Test
    @Rollback
    void testIfPopulationSumCorrect(){
       int Ts = 100;
        Simulation s = simulationService.createSimulation("test", 10000L, 2L, 1.5f, 0.03f, 7, 5, Ts);
        service.generatePandemicDays(s);
        List<PandemicDay> pandemicDays = service.getPandemicDaysForSimulation(s);
        for (int i = 0; i < Ts; i++) {
            PandemicDay pd = pandemicDays.get(i);
            assertEquals(s.getP(), pd.getPi() + pd.getPm() + pd.getPr() + pd.getPv());
        }
    }

    @Test
    void shouldNotAllowSetMortalityTimeGreaterThanInfectionTime(){

    }

    @Test
    void testIfSimulationIsCreated(){

    }

    @Test
    void testIfPandemicDaysIsCreatedForSimulation(){

    }

    @Test
    void testIfInfectedChangeCorrectly(){

    }
}