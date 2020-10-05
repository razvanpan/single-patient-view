package spvproject.patientviewbe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ChiefComplaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Code code;

	@Column
	private String editedBy;

	@Column
	private String admisionNote;

	public ChiefComplaint() {

	}

	public ChiefComplaint(int id, Code code, String editedBy, String admisionNote) {

		this.id = id;
		this.code = code;
		this.editedBy = editedBy;
		this.admisionNote = admisionNote;
	}

	public int getId() {
		return id;
	}

	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
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
