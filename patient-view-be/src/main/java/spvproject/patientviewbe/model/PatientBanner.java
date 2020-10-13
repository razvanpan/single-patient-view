package spvproject.patientviewbe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banner")
public class PatientBanner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ID;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "birthDate")
	private String birthDate;
	
	@Column(name = "lengthStay")
	private String lengthStay;
	
	@Column(name = "ED")
	private String ED;
	
	@Column(name = "allergies")
	private String allergies;
	
	@Column(name = "eID")
	private String eID;
	
	@Column(name = "triage")
	private String triage;
	
	@Column(name = "risks")
	private String risks;
	
	public PatientBanner() {}
	
	public PatientBanner(String iD, String name, String gender, int age, String birthDate, String lengthStay,
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



	public String getID() {
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