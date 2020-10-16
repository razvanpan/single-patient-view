package spvproject.patientviewbe.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spvproject.patientviewbe.model.PatientBanner;

@Repository
public interface PatientBannerRepository extends CrudRepository<PatientBanner, Integer> {
	List<PatientBanner> findAll();
}
