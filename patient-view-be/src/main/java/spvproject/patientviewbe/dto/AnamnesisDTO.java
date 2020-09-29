package spvproject.patientviewbe.dto;

public class AnamnesisDTO {
    private int id;
    private String lastLabsWork;
    private String presentSymptoms;
    private String medicines;
    private String supplements;
    private String familyMedicalHistory;
    private String allergies;

    public AnamnesisDTO() {
    }

    public AnamnesisDTO(int id, String lastLabsWork, String presentSymptoms, String medicines, String supplements, String familyMedicalHistory, String allergies) {
        this.id = id;
        this.lastLabsWork = lastLabsWork;
        this.presentSymptoms = presentSymptoms;
        this.medicines = medicines;
        this.supplements = supplements;
        this.familyMedicalHistory = familyMedicalHistory;
        this.allergies = allergies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastLabsWork() {
        return lastLabsWork;
    }

    public void setLastLabsWork(String lastLabsWork) {
        this.lastLabsWork = lastLabsWork;
    }

    public String getPresentSymptoms() {
        return presentSymptoms;
    }

    public void setPresentSymptoms(String presentSymptoms) {
        this.presentSymptoms = presentSymptoms;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getSupplements() {
        return supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    public String getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    public void setFamilyMedicalHistory(String familyMedicalHistory) {
        this.familyMedicalHistory = familyMedicalHistory;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
}
