/**
 * @author lilyy12
 */

import java.util.ArrayList;
import java.util.List;

public class PrescriptionTest {

	public static void main(String[] args) {
		
		//create a list for all medication.
		Medication n = new Medication(1, "Paraceltamol", 0.99);
		Medication n2 = new Medication(1, "Anti-inflammatory painkillers", 4.99);
		Medication n3 = new Medication(1, "Antihistamines", 1.99);
		Medication n4 = new Medication(1, "Antacids", 10.99);
		Medication n5 = new Medication(1, "Hydrocortisone", 4.99);
		Medication n6 = new Medication(1, "Antiseptic", 5.99);
		Medication n7 = new Medication(1, "Benzodiazepines", 7.99);
    	
    	
    	//create name
    	Name patientName1 = new Name("Jane","Doe");
    	Name patientName2 = new Name("John","Doe");
    	Name doctorName1 = new Name("Jelly","Bean");
    	Name doctorName2 = new Name("Jonlly","Bean");
    	Name doctorName3 = new Name("Jessica","Bean");
    	
    	//create date
    	date today = new date(9, 6, 2022);
    	date tomorrow = new date(10, 6, 2022);
    	
    	//create patient
    	Patient patent1 = new Patient("111", patientName1, 25);
    	Patient patent2 = new Patient("222", patientName2, 50);
    	
    	//create appointment
    	Appointment appointment1 = new Appointment(1, patent1, today, true);
    	Appointment appointment2 = new Appointment(1, patent1, tomorrow, true);
    	Appointment appointment3 = new Appointment(2, patent2, tomorrow, false);
    	
    	//create doctor
    	JuniorDoctor doctor1 = new JuniorDoctor("J1234", doctorName1, null);
    	JuniorDoctor doctor2 = new JuniorDoctor("J2122", doctorName2, null);
    	ConsultantDoctor doctor3 = new ConsultantDoctor("C6488", doctorName3, null);
    	
    	//create a list for perscriptionOne.
    	List<Medication> oneList = new ArrayList<>();
    	oneList.add(n);
    	oneList.add(n2);
    	
    	//create a list for perscriptionTwo.
    	List<Medication> twoList = new ArrayList<>();
    	twoList.add(n3);
    	twoList.add(n5);
    	twoList.add(n7);
    	
    	
    	//creates 2 instances of Prescription
    	Persciption perscriptionOne = new Persciption(1, oneList, appointment1, doctor1);
    	Persciption perscriptionTwo = new Persciption(2, twoList, appointment2, doctor3);
        
    	//use case 1: list the Medication with their price for `perscriptionOne` and `perscriptionTwo`
    	
    	System.out.println("perscriptionOne list:");
    	perscriptionOne.print();
    	
    	System.out.println("perscriptionTwo list:");
    	perscriptionTwo.print();
    	
    	//use case 2: calculate the cost of perscription.
    	
    	System.out.println("perscriptionOne cost:" + perscriptionOne.getCost());
    	System.out.println("perscriptionTwo cost:" + perscriptionTwo.getCost());
    	
    	
	}

}
