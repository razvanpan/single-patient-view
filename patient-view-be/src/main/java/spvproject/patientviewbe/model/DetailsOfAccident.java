package spvproject.patientviewbe.model;

import javax.persistence.*;

@Entity
public class DetailsOfAccident {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String date;

	@Column
	private String time;

	@Column
	private String type;

	@Column
	private String location;

	@Column
	private boolean helmet;

	@Column
	private String mechanism;

	public DetailsOfAccident() {
	}

	public DetailsOfAccident(int id, String date, String time, String type, String location, boolean helmet,
			String mechanism) {
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
