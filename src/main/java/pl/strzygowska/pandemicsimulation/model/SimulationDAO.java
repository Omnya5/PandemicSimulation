package pl.strzygowska.pandemicsimulation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimulationDAO extends CrudRepository<Simulation, Long> {
    Simulation findByN(String name);
}

