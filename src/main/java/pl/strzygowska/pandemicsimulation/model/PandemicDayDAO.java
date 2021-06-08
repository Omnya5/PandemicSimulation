package pl.strzygowska.pandemicsimulation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PandemicDayDAO extends CrudRepository<PandemicDay, Long> {
    List<PandemicDay> findAllBySimulation(Simulation simulation);
}
