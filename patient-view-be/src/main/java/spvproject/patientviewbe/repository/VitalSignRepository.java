package spvproject.patientviewbe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spvproject.patientviewbe.model.VitalSign;

import java.util.List;

@Repository
public interface VitalSignRepository extends CrudRepository<VitalSign, Integer> {
    List<VitalSign> findAll();
}
