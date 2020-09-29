package spvproject.patientviewbe.dto;

public class ChiefComplaintDTO {

	private int id;

	private CodeModelDTO code;

	private String editedBy;

	private String admisionNote;

	public ChiefComplaintDTO(int id, CodeModelDTO code, String editedBy, String admisionNote) {

		this.id = id;
		this.code = code;
		this.editedBy = editedBy;
		this.admisionNote = admisionNote;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CodeModelDTO getCode() {
		return code;
	}

	public void setCode(CodeModelDTO code) {
		this.code = code;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public String getAdmisionNote() {
		return admisionNote;
	}

	public void setAdmisionNote(String admisionNote) {
		this.admisionNote = admisionNote;
	}

}
