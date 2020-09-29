package spvproject.patientviewbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.dto.ChiefComplaintDTO;
import spvproject.patientviewbe.model.ChiefComplaintModel;
import spvproject.patientviewbe.service.ChiefComplaintService;

@RestController
public class ChiefComplaintController {

	private final ChiefComplaintService chiefComplaintService;

	@Autowired
	public ChiefComplaintController(final ChiefComplaintService chiefComplaintService) {
		this.chiefComplaintService = chiefComplaintService;
	}

	@PostMapping(path="/create")
	public ResponseEntity<?> create(@RequestBody ChiefComplaintDTO chiefComplaintData) {
		chiefComplaintService.create(chiefComplaintData);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	@GetMapping("/{id}")
    public ChiefComplaintModel getData(@PathVariable final int id) {
        return chiefComplaintService.get(id);
    }

}
