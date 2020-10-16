package spvproject.patientviewbe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spvproject.patientviewbe.model.PainAssessment;



import java.util.List;

@Repository
public interface PainAssessmentRepository extends CrudRepository<PainAssessment, Integer> {

    List<PainAssessment> findAll();
}
