package spvproject.patientviewbe.model;


public class PatientBanner {
	private int ID;
	private String name;
	private String gender;
	private int age;
	private String birthDate;
	private String lengthStay;
	private String ED;
	private String allergies;
	private String eID;
	private String triage;
	private String risks;
	
	
	
	public PatientBanner(int iD, String name, String gender, int age, String birthDate, String lengthStay,
			String eD, String allergies, String eID, String triage, String risks) {
		this.ID = iD;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.birthDate = birthDate;
		this.lengthStay = lengthStay;
		this.ED = eD;
		this.allergies = allergies;
		this.eID = eID;
		this.triage = triage;
		this.risks = risks;
	}



	public int getID() {
		return ID;
	}



	public String getName() {
		return name;
	}



	public String getGender() {
		return gender;
	}



	public int getAge() {
		return age;
	}



	public String getBirthDate() {
		return birthDate;
	}



	public String getLengthStay() {
		return lengthStay;
	}



	public String getED() {
		return ED;
	}



	public String getAllergies() {
		return allergies;
	}



	public String geteID() {
		return eID;
	}



	public String getTriage() {
		return triage;
	}



	public String getRisks() {
		return risks;
	}
	
	
}