package pl.strzygowska.pandemicsimulation.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PandemicDayDAO extends CrudRepository<PandemicDay, Long> {
}
