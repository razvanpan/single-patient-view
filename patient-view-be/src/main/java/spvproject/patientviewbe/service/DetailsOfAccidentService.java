package spvproject.patientviewbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spvproject.patientviewbe.dto.DetailsOfAccidentDTO;
import spvproject.patientviewbe.model.DetailsOfAccident;
import spvproject.patientviewbe.repository.DetailsOfAccidentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class DetailsOfAccidentService {
	private final DetailsOfAccidentRepository detailsOfAccidentRepository;

	@Autowired
	public DetailsOfAccidentService(final DetailsOfAccidentRepository detailsOfAccidentRepository) {
		this.detailsOfAccidentRepository = detailsOfAccidentRepository;
	}

	public Optional<List<DetailsOfAccidentDTO>> getAllDetailsOfAccident() {
		List<DetailsOfAccidentDTO> detailsOfAccidentDataList = new ArrayList<>();
		for (DetailsOfAccident detailsOfAccident : detailsOfAccidentRepository.findAll()) {
			DetailsOfAccidentDTO detailsOfAccidentData = convertDetailsOfAccidentModelToData().apply(detailsOfAccident);
			detailsOfAccidentDataList.add(detailsOfAccidentData);
		}
		return Optional.ofNullable(detailsOfAccidentDataList);
	}

	
	public void createDetailsOfAccident(DetailsOfAccidentDTO detailsOfAccidentDTO) {
		DetailsOfAccident detailsOfAccident = new DetailsOfAccident(0, detailsOfAccidentDTO.getDate(), detailsOfAccidentDTO.getTime(), detailsOfAccidentDTO.getType(), detailsOfAccidentDTO.getLocation(),
				detailsOfAccidentDTO.hasHelmet(), detailsOfAccidentDTO.getMechanism());
		detailsOfAccidentRepository.save(detailsOfAccident);
	}

	private Function<DetailsOfAccident, DetailsOfAccidentDTO> convertDetailsOfAccidentModelToData() {
		return detailsOfAccident -> new DetailsOfAccidentDTO(detailsOfAccident.getId(), detailsOfAccident.getLocation(),
				detailsOfAccident.getMechanism(), detailsOfAccident.getTime(), detailsOfAccident.getType());
	}

}
