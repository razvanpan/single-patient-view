package spvproject.patientviewbe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.dto.DetailsOfAccidentDTO;
import spvproject.patientviewbe.service.DetailsOfAccidentService;

@RestController
@RequestMapping("/details-of-accident")
public class DetailsOfAccidentController {

	private final DetailsOfAccidentService detailsOfAccidentService;

	@Autowired
	public DetailsOfAccidentController(DetailsOfAccidentService detailsOfAccidentService) {
		this.detailsOfAccidentService = detailsOfAccidentService;
	}
	
	@GetMapping("/all")
	public List<DetailsOfAccidentDTO> getDetailsOfAccident() {
		return detailsOfAccidentService.getAllDetailsOfAccident().get();
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addDetailsOffAccident(@RequestBody DetailsOfAccidentDTO detailsOfAccidentDTO){
		detailsOfAccidentService.createDetailsOfAccident(detailsOfAccidentDTO);
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
