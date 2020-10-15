package spvproject.patientviewbe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spvproject.patientviewbe.model.ChiefComplaint;

@Repository
public interface ChiefComplaintRepository extends CrudRepository<ChiefComplaint, Integer> {

}