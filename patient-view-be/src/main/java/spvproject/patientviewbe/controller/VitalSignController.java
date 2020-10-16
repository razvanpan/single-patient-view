package spvproject.patientviewbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spvproject.patientviewbe.dto.VitalSignDTO;

import spvproject.patientviewbe.service.VitalSignService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/vital-signs")
public class VitalSignController {

	private final VitalSignService vitalSignService;

	@Autowired
	public VitalSignController(VitalSignService vitalSignService) {
		this.vitalSignService = vitalSignService;
	}

    @GetMapping("/all")
	public List<VitalSignDTO> getVitalSigns() {
		return vitalSignService.getAllVitalSigns().get();
	}

    @PostMapping("/add")
	public ResponseEntity<?> addVitalSign(@RequestBody VitalSignDTO vitalSignDTO) {
		vitalSignService.createVitalSign(vitalSignDTO);
		return ResponseEntity.ok(HttpStatus.OK);
	}

	@PatchMapping("/edit/{id}/{value}")
	public VitalSignDTO editVitalSign(@PathVariable("id") int id, @PathVariable("value") String value){
		return vitalSignService.updateVitalSign(id, value);
	}
}
