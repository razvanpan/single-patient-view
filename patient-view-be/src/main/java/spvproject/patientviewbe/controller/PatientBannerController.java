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

import spvproject.patientviewbe.dto.PatientBannerDTO;
import spvproject.patientviewbe.model.PatientBanner;
import spvproject.patientviewbe.repository.PatientBannerRepository;
import spvproject.patientviewbe.service.PatientBannerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/patient-banner")
public class PatientBannerController {

	private PatientBannerService patientBannerService;

	@GetMapping("/data")
	public PatientBanner getPatientBanner() {
		return new PatientBanner("0039876", "Bruno Mertens", "M", 42, "20.09.1976", "03:42", "302",
				"Peniciline, Bee Venom, Latex", "39223456", "-", "🏥 💗");
	}

	@Autowired
	public PatientBannerController(PatientBannerService patientBannerService) {
		this.patientBannerService = patientBannerService;
	}

	@GetMapping("/all")
	public List<PatientBannerDTO> getBanner() {
		return patientBannerService.getAllPatientBanner().get();
	}

	@PostMapping("/add")
	public ResponseEntity<?> addPatient(@RequestBody PatientBannerDTO patientBannerDTO) {
		patientBannerService.createPatientBanner(patientBannerDTO);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}