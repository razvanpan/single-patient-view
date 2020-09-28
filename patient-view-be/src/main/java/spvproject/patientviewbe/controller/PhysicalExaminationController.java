package spvproject.patientviewbe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spvproject.patientviewbe.model.PhysicalExamination;
import spvproject.patientviewbe.repository.PhysicalExaminationRepository;

import java.util.List;

@CrossOrigin(origins = "http:localhost:3000")
@RestController
public class PhysicalExaminationController {

    @Autowired
    PhysicalExaminationRepository physicalExaminationRepository;

    @GetMapping(path="/form")
    public List<PhysicalExamination> getAllData(){
        return physicalExaminationRepository.findAll();
    }

    @PostMapping(path="/form")
    public PhysicalExamination addData(@RequestBody PhysicalExamination physExamDTO){
        return physicalExaminationRepository.save(physExamDTO);
    }

    @DeleteMapping(path="/form")
    public void deleteData(@PathVariable long id){
        physicalExaminationRepository.deleteById(id);
    }




}
