package spvproject.patientviewbe.model;

public class PainAssessmentModel {
	private final int painAssessment;
	private final int id;
	
	public PainAssessmentModel(int id,int painAssessment)
	
	{
		this.painAssessment=painAssessment;
		this.id=id;
		
		
	}
	public int getPainAssessment() {
		
		return painAssessment;
	}
	public int getid() {
		
		return id;
	}
	
}


