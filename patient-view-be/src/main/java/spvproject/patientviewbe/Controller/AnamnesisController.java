package spvproject.patientviewbe.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spvproject.patientviewbe.Model.AnamnesisModel;

@RestController
@RequestMapping("/anamnesis")
public class AnamnesisController {

    @GetMapping("/first")
    public AnamnesisModel anamnesisdata(){
        return new AnamnesisModel(1,"3-august-2020","fever","acetaminophen","vitamin C","none","none");
    }
}
