package spvproject.patientviewbe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spvproject.patientviewbe.dto.VitalSignDTO;
import spvproject.patientviewbe.model.VitalSign;
import spvproject.patientviewbe.repository.VitalSignRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class VitalSignService {

    private final VitalSignRepository vitalSignRepository;

    @Autowired
    public VitalSignService(final VitalSignRepository vitalSignRepository) {
        this.vitalSignRepository = vitalSignRepository;
    }

    public Optional<List<VitalSignDTO>> getAllVitalSigns() {
        List<VitalSignDTO> vitalSignDataList = new ArrayList<>();
        for (VitalSign vitalSign : vitalSignRepository.findAll()) {
            VitalSignDTO vitalSignData = convertVitalSignModelToData().apply(vitalSign);
            vitalSignDataList.add(vitalSignData);
        }
        return Optional.ofNullable(vitalSignDataList);
    }

    public void createVitalSign(VitalSignDTO vitalSignDTO) {
        VitalSign vitalSign = new VitalSign(0, vitalSignDTO.getVitalSign(), vitalSignDTO.getValue(), vitalSignDTO.getUnitMeasure(), vitalSignDTO.getTime());
        vitalSignRepository.save(vitalSign);
    }

    private Function<VitalSign, VitalSignDTO> convertVitalSignModelToData() {
        return vitalSign -> new VitalSignDTO(
                vitalSign.getId(),
                vitalSign.getVitalSign(),
                vitalSign.getValue(),
                vitalSign.getUnitMeasure(),
                vitalSign.getTime());
    }

}
