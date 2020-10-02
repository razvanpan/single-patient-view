package spvproject.patientviewbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spvproject.patientviewbe.dto.ChiefComplaintDTO;
import spvproject.patientviewbe.model.ChiefComplaint;
import spvproject.patientviewbe.model.Code;
import spvproject.patientviewbe.repository.ChiefComplaintRepository;
import spvproject.patientviewbe.repository.CodeRepository;

@Service
public class ChiefComplaintService {

	private final ChiefComplaintRepository cheifComplaintRepository;
	private final CodeService codeService;

	@Autowired
	public ChiefComplaintService(final ChiefComplaintRepository chiefComplaintRepository,
			final CodeService codeService) {
		this.cheifComplaintRepository = chiefComplaintRepository;
		this.codeService = codeService;
	}

	public void create( ChiefComplaintDTO chiefComplaintData) {
		Code codeModel = new Code(0, chiefComplaintData.getCode().getIdCode(),
				chiefComplaintData.getCode().getTranslationCode());
		ChiefComplaint chiefComplaintModel = new ChiefComplaint(0, codeModel,
				chiefComplaintData.getEditedBy(), chiefComplaintData.getAdmisionNote());
		codeService.create(codeModel);
		cheifComplaintRepository.save(chiefComplaintModel);
	}

	public ChiefComplaint get(final int id) {
		return cheifComplaintRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
	}

}
