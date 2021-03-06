package spvproject.patientviewbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.dto.ChiefComplaintDTO;
import spvproject.patientviewbe.model.ChiefComplaint;
import spvproject.patientviewbe.service.ChiefComplaintService;

@RestController
@RequestMapping("/chief-complaint")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ChiefComplaintController {

	private final ChiefComplaintService chiefComplaintService;

	@Autowired
	public ChiefComplaintController(final ChiefComplaintService chiefComplaintService) {
		this.chiefComplaintService = chiefComplaintService;
	}

	@PostMapping(path = "/create")
	public ResponseEntity<?> create(@RequestBody ChiefComplaintDTO chiefComplaintData) {
		if (chiefComplaintData.getId() > 0) {
			if (!chiefComplaintService.update(chiefComplaintData.getId(), chiefComplaintData.getAdmisionNote())) {
				chiefComplaintService.create(chiefComplaintData);
			}
		} else {
			chiefComplaintService.create(chiefComplaintData);
		}

		return ResponseEntity.ok(HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ChiefComplaint getData(@PathVariable final int id) {
		return chiefComplaintService.get(id);
	}

}
