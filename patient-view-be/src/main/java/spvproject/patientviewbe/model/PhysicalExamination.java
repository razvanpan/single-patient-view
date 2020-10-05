package spvproject.patientviewbe.model;

import javax.persistence.*;

@Entity
public class PhysicalExamination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "phys_exam_data")
    private String physExamData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }

    public String getPhysExamData() {
        return physExamData;
    }

    public void setPhysExamData(String physExamData) {
        this.physExamData = physExamData;
    }

}
