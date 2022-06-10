/**
 * @author lilyy12
 */

import java.util.ArrayList;
import java.util.List;

public class Persciption {
	
	int persciptionID;
	List<Medication> medication;
	Appointment appointment;
	Doctor doctor;
	
	public Persciption(int persciptionID, List<Medication> medication, Appointment appointment, Doctor doctor) {
		super();
		this.persciptionID = persciptionID;
		this.medication = medication;
		this.appointment = appointment;
		this.doctor = doctor;
	}
	
	public Double getCost() {
		double cost = 0;
    	for(int i=0;i<medication.size();i++) {
    		cost += (medication.get(i)).unitPrice;
    	}
		return cost;
	}
	
	public void print() {
		for(int i=0;i<medication.size();i++) {
			System.out.println(medication.get(i));
    	}
	}
}

class Medication {
	int medicationID;
	String medicationName;
	double unitPrice;
	
	public Medication(int medicationID, String medicationName, double unitPrice) {
		super();
		this.medicationID = medicationID;
		this.medicationName = medicationName;
		this.unitPrice = unitPrice;
	}
	
	@Override
	public String toString() {
		return "Medication [medicationID=" + medicationID + ", medicationName=" + medicationName + ", unitPrice="
				+ unitPrice + "]";
	}
	
	
}

class DiscountedMedication {
	double discount;

	public DiscountedMedication(double discount) {
		super();
		this.discount = discount;
	}
	
	
}

abstract class Doctor {
	String doctorID;
	Name doctorName;
	Department doctorDepartment;
	
	public Doctor(String doctorID, Name doctorName, Department doctorDepartment) {
		super();
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.doctorDepartment = doctorDepartment;
	}
	
	public abstract String generateDoctorID();
	
}

class JuniorDoctor extends Doctor {
	
	String teamAssign;

	public JuniorDoctor(String doctorID, Name doctorName, Department doctorDepartment) {
		super(doctorID, doctorName, doctorDepartment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateDoctorID() {
		// TODO Auto-generated method stub
		return "J" + (int)(Math.random()*10000);
	}
	
}

class ConsultantDoctor extends Doctor {
	
	boolean teamLeader;
	String specialisation;

	public ConsultantDoctor(String doctorID, Name doctorName, Department doctorDepartment) {
		super(doctorID, doctorName, doctorDepartment);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String generateDoctorID() {
		// TODO Auto-generated method stub
		return "C" + (int)(Math.random()*10000);
		
	}
	
}

class Department {
	
}

class Name {
	
	String firstName;
	String surName;
	
	public Name(String firstName, String surName) {
		super();
		this.firstName = firstName;
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", surName=" + surName + "]";
	}
}


class date {
	int day;
	int month;
	int year;
	
	public date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}

class Patient {
	
	String patientID;
	Name patientName;
	int age;
	
	public Patient(String patientID, Name patientName, int age) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", patientName=" + patientName + ", age=" + age + "]";
	}
	
}
