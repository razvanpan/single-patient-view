package spvproject.patientviewbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spvproject.patientviewbe.dto.ChiefComplaintDTO;
import spvproject.patientviewbe.model.ChiefComplaintModel;
import spvproject.patientviewbe.model.CodeModel;
import spvproject.patientviewbe.repository.ChiefComplaintRepository;
import spvproject.patientviewbe.repository.CodeRepository;

@Service
public class ChiefComplaintService {

	private final ChiefComplaintRepository cheifComplaintRepository;
	private final CodeService codeService;

	@Autowired
	public ChiefComplaintService(final ChiefComplaintRepository cheifComplaintRepository,
			final CodeService codeService) {
		this.cheifComplaintRepository = cheifComplaintRepository;
		this.codeService = codeService;
	}

	public void create( ChiefComplaintDTO chiefComplaintData) {
		CodeModel codeModel = new CodeModel(0, chiefComplaintData.getCode().getIdCode(),
				chiefComplaintData.getCode().getTranslationCode());
		ChiefComplaintModel chiefComplaintModel = new ChiefComplaintModel(0, codeModel,
				chiefComplaintData.getEditedBy(), chiefComplaintData.getAdmisionNote());
		codeService.create(codeModel);
		cheifComplaintRepository.save(chiefComplaintModel);
	}

	public ChiefComplaintModel get(final int id) {
		return cheifComplaintRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
	}

}
