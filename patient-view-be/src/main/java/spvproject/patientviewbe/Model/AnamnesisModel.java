package spvproject.patientviewbe.Model;

public class AnamnesisModel {
    private int id;
    private String lastLabsWork;
    private String presentSymptoms;
    private String medicines;
    private String supplements;
    private String familyMedicalHistory;
    private String allergies;

    public AnamnesisModel(int id, String lastLabsWork, String presentSymptoms, String medicines, String supplements, String familyMedicalHistory, String allergies) {
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

    public String getLastLabsWork() {
        return lastLabsWork;
    }

    public String getPresentSymptoms() {
        return presentSymptoms;
    }

    public String getMedicines() {
        return medicines;
    }

    public String getSupplements() {
        return supplements;
    }

    public String getFamilyMedicalHistory() {
        return familyMedicalHistory;
    }

    public String getAllergies() {
        return allergies;
    }
}