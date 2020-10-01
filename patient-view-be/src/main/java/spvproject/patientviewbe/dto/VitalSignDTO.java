package spvproject.patientviewbe.dto;

public class VitalSignDTO {
    private int id;
    private String vitalSign;
    private String value;
    private String unitMeasure;
    private String time;

    public VitalSignDTO() {

    }

    public VitalSignDTO(int id, String vitalSign, String value, String unitMeasure, String time) {
        this.id = id;
        this.vitalSign = vitalSign;
        this.value = value;
        this.unitMeasure = unitMeasure;
        this.time = time;
    }

    public String getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(String vitalSign) {
        this.vitalSign = vitalSign;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
