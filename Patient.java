package java_practice_day_9;

public class Patient extends Data{
	
	private String name;
	private String lastName;
	private int patientId;
	private Case patientCase;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public Case getPatientCase() {
		return patientCase;
	}


	public void setPatientCase(Case patientCase) {
		this.patientCase = patientCase;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
