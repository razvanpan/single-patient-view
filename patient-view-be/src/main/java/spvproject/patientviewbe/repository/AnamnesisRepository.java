package spvproject.patientviewbe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spvproject.patientviewbe.model.Anamnesis;

@Repository
public interface AnamnesisRepository extends CrudRepository<Anamnesis, Integer> {
}
