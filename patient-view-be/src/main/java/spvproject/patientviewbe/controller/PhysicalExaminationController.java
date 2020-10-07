package spvproject.patientviewbe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spvproject.patientviewbe.model.PhysicalExamination;
import spvproject.patientviewbe.repository.PhysicalExaminationRepository;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/physical-examination")
public class PhysicalExaminationController {

    @Autowired
    PhysicalExaminationRepository physicalExaminationRepository;


    @GetMapping(path="/data")
    public List<PhysicalExamination> getAllData(){
        return (List<PhysicalExamination>) physicalExaminationRepository.findAll();
    }


    @PostMapping(path="/data")
    public PhysicalExamination addData(@RequestBody PhysicalExamination physExamDTO){
        return physicalExaminationRepository.save(physExamDTO);
    }

    @DeleteMapping(path="/data")

    public void deleteData(@PathVariable long id){
        physicalExaminationRepository.deleteById(id);
    }




}
