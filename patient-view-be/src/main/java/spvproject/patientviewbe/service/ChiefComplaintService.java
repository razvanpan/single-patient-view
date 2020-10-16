package spvproject.patientviewbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spvproject.patientviewbe.dto.ChiefComplaintDTO;
import spvproject.patientviewbe.model.ChiefComplaint;
import spvproject.patientviewbe.model.Code;
import spvproject.patientviewbe.repository.ChiefComplaintRepository;

@Service
public class ChiefComplaintService {

	private final ChiefComplaintRepository chiefComplaintRepository;
	private final CodeService codeService;

	@Autowired
	public ChiefComplaintService(final ChiefComplaintRepository chiefComplaintRepository,
			final CodeService codeService) {
		this.chiefComplaintRepository = chiefComplaintRepository;
		this.codeService = codeService;
	}

	public void create(ChiefComplaintDTO chiefComplaintData) {
		Code codeModel = new Code(0, chiefComplaintData.getCode().getIdCode(),
				chiefComplaintData.getCode().getTranslationCode());
		ChiefComplaint chiefComplaintModel = new ChiefComplaint(0, codeModel, chiefComplaintData.getEditedBy(),
				chiefComplaintData.getAdmisionNote());
		codeService.create(codeModel);
		chiefComplaintRepository.save(chiefComplaintModel);
	}

	public boolean update(int id, String note) {

		ChiefComplaint chiefComplaint = chiefComplaintRepository.findById(id).orElse(null);
		if (chiefComplaint != null) {
			chiefComplaint.setAdmisionNote(note);
			chiefComplaintRepository.save(chiefComplaint);
			return true;
		}
		return false;
	}

	public ChiefComplaint get(final int id) {
		return chiefComplaintRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
	}

}
