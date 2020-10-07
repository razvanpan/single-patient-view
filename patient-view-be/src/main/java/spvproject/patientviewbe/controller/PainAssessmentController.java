package spvproject.patientviewbe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.dto.PainAssessmentDTO;
import spvproject.patientviewbe.model.PainAssessment;
import spvproject.patientviewbe.service.PainAssessmentService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/pain-assessment")
public class PainAssessmentController {

	private final PainAssessmentService painAssessmentService;
	@Autowired
	public PainAssessmentController(PainAssessmentService painAssessmentService) {
		
		this.painAssessmentService = painAssessmentService;
	}
	@GetMapping("/data")
	public List<PainAssessmentDTO> getPainAssessment() {
		return painAssessmentService.getAllPainAssessment().get();
	

	}
	@PostMapping("/add")
	public PainAssessmentDTO addPainAssessment(@RequestBody PainAssessmentDTO painAssessmentDTO) {
		painAssessmentService.createPainAssessment(painAssessmentDTO);
		return painAssessmentDTO;
	}

}
