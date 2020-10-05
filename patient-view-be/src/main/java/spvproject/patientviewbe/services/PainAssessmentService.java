package spvproject.patientviewbe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spvproject.patientviewbe.dto.PainAssessmentDTO;
import spvproject.patientviewbe.model.PainAssessment;

import spvproject.patientviewbe.repository.PainAssessmentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PainAssessmentService {

	private final PainAssessmentRepository painAssessmentRepository;

	@Autowired
	public PainAssessmentService(final PainAssessmentRepository painAssessmentRepository) {
		this.painAssessmentRepository = painAssessmentRepository;
	}

	public Optional<List<PainAssessmentDTO>> getAllPainAssessment() {
		List<PainAssessmentDTO> painAssessmentDataList = new ArrayList<>();
		for (PainAssessment painAssessment : painAssessmentRepository.findAll()) {
			PainAssessmentDTO painAssessmentData = convertPainAssessmenttoData().apply(painAssessment);
			painAssessmentDataList.add(painAssessmentData);
		}
		return Optional.ofNullable(painAssessmentDataList);
	}

	private Function<PainAssessment, PainAssessmentDTO> convertPainAssessmenttoData() {
		return painAssessment -> new PainAssessmentDTO(painAssessment.getId(), painAssessment.getPainAssessment());

	}
}