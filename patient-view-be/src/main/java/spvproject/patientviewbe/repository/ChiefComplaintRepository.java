package spvproject.patientviewbe.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spvproject.patientviewbe.model.ChiefComplaintModel;

@Repository
public interface ChiefComplaintRepository extends CrudRepository<ChiefComplaintModel,Integer> {
	
}