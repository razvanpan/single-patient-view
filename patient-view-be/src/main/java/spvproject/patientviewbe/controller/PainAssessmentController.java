package spvproject.patientviewbe.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.model.PainAssessmentModel;

@RestController
@RequestMapping("/painAssessment")
public class PainAssessmentController {
	
	
	@GetMapping("/first")
	public PainAssessmentModel painAssessmentdata() {
		return new PainAssessmentModel(1,1);
		
	}
	
}
