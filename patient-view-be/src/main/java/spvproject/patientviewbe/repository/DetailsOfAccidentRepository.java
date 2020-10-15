package spvproject.patientviewbe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spvproject.patientviewbe.model.DetailsOfAccident;

import java.util.List;

@Repository
public interface DetailsOfAccidentRepository extends CrudRepository<DetailsOfAccident, Integer> {

    List<DetailsOfAccident> findAll();
}
