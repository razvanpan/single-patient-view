package spvproject.patientviewbe.dto;

public class DetailsOfAccidentDTO {
	private int id;
	private String date;
	private String time;
	private String type;
	private String location;
	private boolean helmet;
	private String mechanism;

	public DetailsOfAccidentDTO() {

	}

	public DetailsOfAccidentDTO(int id, String vitalSign, String value, String unitMeasure, String time) {
		this.id = id;
		this.date = date;
		this.time = time;
		this.type = type;
		this.location = location;
		this.helmet = helmet;
		this.mechanism = mechanism;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean hasHelmet() {
		return helmet;
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public String getMechanism() {
		return mechanism;
	}

	public void setMechanism(String mechanism) {
		this.mechanism = mechanism;
	}
}
