package spvproject.patientviewbe.model;

public class PainAssessment {
	private final int painAssessment;
	private final int id;
	
	public PainAssessment(int id,int painAssessment)
	
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


