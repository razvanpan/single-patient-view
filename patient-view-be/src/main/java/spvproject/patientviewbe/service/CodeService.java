package spvproject.patientviewbe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spvproject.patientviewbe.model.CodeModel;
import spvproject.patientviewbe.repository.CodeRepository;

@Service
public class CodeService {

	private final CodeRepository codeRepository;

	@Autowired
	public CodeService(final CodeRepository codeRepository) {
		this.codeRepository = codeRepository;
	}

	public void create( CodeModel codeModel) {
		codeRepository.save(codeModel);
	}

	public CodeModel get(final int id) {
		return codeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
	}


}
