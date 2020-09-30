package spvproject.patientviewbe.model;


public class DetailsOfAccidentModel {
	private String date;
	private String time;
	private String type;
	private String location;
	private boolean helmet;
	private String mechanism;
	
	public DetailsOfAccidentModel(String date, String time, String type, String location, boolean helmet,
			String mechanism) {
		super();
		this.date = date;
		this.time = time;
		this.type = type;
		this.location = location;
		this.helmet = helmet;
		this.mechanism = mechanism;
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

	public boolean isHelmet() {
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
