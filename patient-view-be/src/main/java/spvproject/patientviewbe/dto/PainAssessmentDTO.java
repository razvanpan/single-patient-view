package spvproject.patientviewbe.dto;

public class PainAssessmentDTO {
	private int painAssessment;
	private int id;

	public PainAssessmentDTO(int id, int painAssessment) {
		this.id = id;
		this.painAssessment = painAssessment;

	}

	public int getPainAssessment() {
		return painAssessment;
	}

	public void setPainAssessment(int painAssessment) {
		this.painAssessment = painAssessment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
