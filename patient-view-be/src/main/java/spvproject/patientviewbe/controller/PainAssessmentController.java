package spvproject.patientviewbe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.model.PainAssessment;

@RestController
@RequestMapping("/pain-assessment")
public class PainAssessmentController {

	@GetMapping("/data")
	public PainAssessment painAssessmentData() {
		return new PainAssessment(1, 1);

	}

}
