package spvproject.patientviewbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spvproject.patientviewbe.model.Anamnesis;
import spvproject.patientviewbe.repository.AnamnesisRepository;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/anamnesis")
public class AnamnesisController {

    @Autowired
    AnamnesisRepository anamnesisRepository;

    @GetMapping("/all")
    public List<Anamnesis> getAllData() {
        return (List<Anamnesis>) anamnesisRepository.findAll();
    }

    @PostMapping("/add")
    public Anamnesis addData(@RequestBody Anamnesis anamnesisDTO) {
        Anamnesis anamnesis = new Anamnesis(0,
                anamnesisDTO.getLastLabsWork(),
                anamnesisDTO.getPresentSymptoms(),
                anamnesisDTO.getMedicines(),
                anamnesisDTO.getSupplements(),
                anamnesisDTO.getFamilyMedicalHistory(),
                anamnesisDTO.getAllergies());
        return anamnesisRepository.save(anamnesis);
    }
}