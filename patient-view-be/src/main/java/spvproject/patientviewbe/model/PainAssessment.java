package spvproject.patientviewbe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PainAssessment {

	@Column
	private int painAssessment;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public PainAssessment() {

	}

	public PainAssessment(int id, int painAssessment)

	{
		this.painAssessment = painAssessment;
		this.id = id;

	}

	public int getPainAssessment() {

		return painAssessment;
	}

	public int getId() {

		return id;
	}

	public void setPainAssessment(int painAssessment) {
		this.painAssessment = painAssessment;
	}

	public void setId(int id) {
		this.id = id;
	}

}
