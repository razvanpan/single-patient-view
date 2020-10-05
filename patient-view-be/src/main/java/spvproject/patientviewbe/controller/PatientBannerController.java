package spvproject.patientviewbe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.model.PatientBanner;

@RestController
@RequestMapping("/patient-banner")
public class PatientBannerController {
	@GetMapping("/data")
	public PatientBanner patientBanner() {
		return new PatientBanner(1, "Bruno Mertens", "M", 42, "20.09.1976", "03:42", "302",
				"Peniciline, Bee Venom, Latex", "39223456", "-", "-");
	}
}