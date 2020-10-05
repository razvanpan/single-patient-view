package spvproject.patientviewbe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spvproject.patientviewbe.model.Code;

@Repository
public interface CodeRepository extends CrudRepository<Code, Integer> {

}