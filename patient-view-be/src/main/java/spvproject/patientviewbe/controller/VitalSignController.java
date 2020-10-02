package spvproject.patientviewbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spvproject.patientviewbe.dto.VitalSignDTO;
import spvproject.patientviewbe.model.VitalSignModel;
import spvproject.patientviewbe.services.VitalSignService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/vital-signs")
public class VitalSignController {

	private final VitalSignService vitalSignService;

	@Autowired
	public VitalSignController(VitalSignService vitalSignService) {
		this.vitalSignService = vitalSignService;
	}

	@GetMapping("/vitalSigns")
	public List<VitalSignDTO> getVitalSigns() {
		return vitalSignService.getAllVitalSigns().get();
	}

	@PostMapping("/addVitalSign")
	public ResponseEntity<?> addVitalSign(@RequestBody VitalSignDTO vitalSignDTO) {
		vitalSignService.createVitalSign(vitalSignDTO);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
