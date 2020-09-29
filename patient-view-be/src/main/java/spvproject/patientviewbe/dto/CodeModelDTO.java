package spvproject.patientviewbe.dto;



public class CodeModelDTO {

	
	private int id;
	
	private String idCode;
	
	private String translationCode;

	public CodeModelDTO(int id, String idCode, String translationCode) {
		super();
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
