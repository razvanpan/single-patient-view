package spvproject.patientviewbe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spvproject.patientviewbe.model.DetailsOfAccidentModel;


@RestController
@RequestMapping("/details-of-accident")
public class DetailsOfAccidentController {
	@GetMapping("/details-of-accident")
	public DetailsOfAccidentModel detailsOfAccident() {
		return new DetailsOfAccidentModel("26/06/2019","10:15","car accident","Goethestrasse 12", true, "blunt");
	}

}
