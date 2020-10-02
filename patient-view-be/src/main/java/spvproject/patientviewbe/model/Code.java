package spvproject.patientviewbe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Code {
	

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String idCode;
	
	@Column
	private String translationCode;

	public Code() {
		
	}

	public Code(int id, String idCode, String translationCode) {
		
		this.id = id;
		this.idCode = idCode;
		this.translationCode = translationCode;
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public String getTranslationCode() {
		return translationCode;
	}

	public void setTranslationCode(String translationCode) {
		this.translationCode = translationCode;
	}

	public int getId() {
		return id;
	}
	
}
