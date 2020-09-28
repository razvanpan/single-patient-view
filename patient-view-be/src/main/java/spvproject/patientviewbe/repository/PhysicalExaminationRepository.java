package spvproject.patientviewbe.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spvproject.patientviewbe.model.PhysicalExamination;

public interface PhysicalExaminationRepository extends JpaRepository<PhysicalExamination,Long> {
}
