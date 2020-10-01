package spvproject.patientviewbe.model;


import javax.persistence.*;

@Entity
public class VitalSignModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String vitalSign;

    @Column
    private String vitalSignValue;

    @Column
    private String unitMeasure;

    @Column
    private String timeOfSubmit;

    public VitalSignModel() {

    }

    public VitalSignModel(int id, String vitalSign, String vitalSignValue, String unitMeasure, String timeOfSubmit) {
        this.id = id;
        this.vitalSign = vitalSign;
        this.vitalSignValue = vitalSignValue;
        this.unitMeasure = unitMeasure;
        this.timeOfSubmit = timeOfSubmit;
    }

    public int getId() {
        return id;
    }

    public String getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(String vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getValue() {
        return vitalSignValue;
    }

    public void setValue(String value) {
        this.vitalSignValue = value;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public String getTime() {
        return timeOfSubmit;
    }

    public void setTime(String time) {
        this.timeOfSubmit = time;
    }
}
