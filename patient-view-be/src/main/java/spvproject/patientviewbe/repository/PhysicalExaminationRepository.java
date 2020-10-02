package spvproject.patientviewbe.repository;


import org.springframework.data.repository.CrudRepository;
import spvproject.patientviewbe.model.PhysicalExamination;

public interface PhysicalExaminationRepository extends CrudRepository<PhysicalExamination,Long> {
}
