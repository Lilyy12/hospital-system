import java.util.List;

public class Appointment {
	
	int appointmentID;
	Patient Patient;
	date date;
	boolean complated;
	
	public Appointment(int appointmentID, Patient patient, date date, boolean complated) {
		super();
		this.appointmentID = appointmentID;
		Patient = patient;
		this.date = date;
		this.complated = complated;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentID=" + appointmentID + ", Patient=" + Patient + ", date=" + date
				+ ", complated=" + complated + "]";
	} 

}

class filterAppointment {
	
	Appointment appointment;
	
	public filterAppointment(int appointmentID, Patient patient, date date, boolean complated) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment filterAppointmentByID(int appointmentID) {
		return appointment;
	}
	
	public List<Appointment> filterAppointmentByPatientID(int appointmentID) {
		return null;
	}
}


