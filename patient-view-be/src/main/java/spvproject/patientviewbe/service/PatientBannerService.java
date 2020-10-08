package spvproject.patientviewbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spvproject.patientviewbe.dto.PatientBannerDTO;
import spvproject.patientviewbe.model.PatientBanner;
import spvproject.patientviewbe.repository.PatientBannerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PatientBannerService {

	private final PatientBannerRepository patientBannerRepository;

	@Autowired
	public PatientBannerService(final PatientBannerRepository patientBannerRepository) {
		this.patientBannerRepository = patientBannerRepository;
	}

	public Optional<List<PatientBannerDTO>> getAllPatientBanner() {
		List<PatientBannerDTO> patientBannerDataList = new ArrayList<>();
		for (PatientBanner patientBanner : patientBannerRepository.findAll()) {
			PatientBannerDTO patientBannerData = convertPatientBannerModelToData().apply(patientBanner);
			patientBannerDataList.add(patientBannerData);
		}
		return Optional.ofNullable(patientBannerDataList);
	}

	public void createPatientBanner(PatientBannerDTO patientBannerDTO) {
		PatientBanner patientBanner = new PatientBanner(patientBannerDTO.getID(), patientBannerDTO.getName(), patientBannerDTO.getGender(),
				patientBannerDTO.getAge(), patientBannerDTO.getBirthDate(), patientBannerDTO.getLengthStay(),
				patientBannerDTO.getED(), patientBannerDTO.getAllergies(), patientBannerDTO.geteID(),
				patientBannerDTO.getTriage(), patientBannerDTO.getRisks());
		patientBannerRepository.save(patientBanner);
	}

	private Function<PatientBanner, PatientBannerDTO> convertPatientBannerModelToData() {
		return patientBanner -> new PatientBannerDTO(patientBanner.getID(), patientBanner.getName(), patientBanner.getGender(),
				patientBanner.getAge(), patientBanner.getBirthDate(), patientBanner.getLengthStay(),
				patientBanner.getED(), patientBanner.getAllergies(), patientBanner.geteID(),
				patientBanner.getTriage(), patientBanner.getRisks());
	}
	
}
