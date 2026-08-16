package com.JavaTraining.FinalTask;
import java.util.*;

abstract class Person {
	private int id, age;
	private String name;

	Person(int id, String name, int age) {
		this.id = id; this.name = name; this.age = age;
	}

	int getId() { return id; }
	String getName() { return name; }

	abstract void displayDetails();
}

class Patient extends Person {
	private String disease, bloodGroup;

	Patient(int id, String name, int age, String disease, String bloodGroup) {
		super(id, name, age);
		this.disease = disease;
		this.bloodGroup = bloodGroup;
	}

	void displayDetails() {
		System.out.println("Patient: " + getId() + " | Name : " + getName()
			+ " | Disease : " + disease + " | Blood Group : " + bloodGroup);
	}
}

class Doctor extends Person {
	private String speciality;
	private int experience;
	private double fee;

	Doctor(int id, String name, int age, String speciality, int experience, double fee) {
		super(id, name, age);
		this.speciality = speciality;
		this.experience = experience;
		this.fee = fee;
	}

	String getSpeciality() { return speciality; }

	void displayDetails() {
		System.out.println("Doctor: " + getId() + " |  Name : " + getName()
			+ " | Speciality :  " + speciality + " | Experience : " + experience + " yrs | Fees : Rs." + fee);
	}
}

class Department {
	int id;
	String name;

	Department(int id, String name) {
		this.id = id; this.name = name;
	}

	void display() {
		System.out.println("Department: " + id + " | Name : " + name);
	}
}


class Appointment {
	int id;
	Patient patient;
	Doctor doctor;
	String date, time, status = "Booked";

	Appointment(int id, Patient p, Doctor d, String date, String time) {
		this.id = id;
		patient = p;
		doctor = d;
		this.date = date;
		this.time = time;
	}

	void display() {
		System.out.println("Appointment: " + id + " | Patient: "
           + patient.getName() + " | Doctor: " + doctor.getName()
           + " | Date :  " + date + " " + time + " | Status : " + status);
	}
}


class PatientNotFoundException extends Exception {
	PatientNotFoundException(String msg) { super(msg); }
}

class DoctorNotFoundException extends Exception {
	DoctorNotFoundException(String msg) { super(msg); }
}

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) { super(msg); }
}


class Hospital {
	ArrayList<Patient> patients = new ArrayList<>();
	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Department> departments = new ArrayList<>();
	LinkedList<Appointment> appointments = new LinkedList<>();

	void addPatient(Patient p) { patients.add(p); }
	void addDoctor(Doctor d) { doctors.add(d); }
	void addDepartment(Department d) { departments.add(d); }

	Patient findPatient(int id) throws PatientNotFoundException {
		for (Patient p : patients)
			if (p.getId() == id) return p;
		throw new PatientNotFoundException("Patient not found!");
	}

	Doctor findDoctor(int id) throws DoctorNotFoundException {
		for (Doctor d : doctors)
			if (d.getId() == id) return d;
		throw new DoctorNotFoundException("Doctor not found!");
	}

	void removePatient(int id) throws PatientNotFoundException {
		patients.remove(findPatient(id));
	}

	void removeDoctor(int id) throws DoctorNotFoundException {
		doctors.remove(findDoctor(id));
	}

	void searchSpeciality(String s) {
		for (Doctor d : doctors)
			if (d.getSpeciality().equalsIgnoreCase(s))
				d.displayDetails();
	}

	void book(int aid, int pid, int did, String date, String time)
			throws PatientNotFoundException, DoctorNotFoundException {
		Patient p = findPatient(pid);
		Doctor d = findDoctor(did);
		appointments.add(new Appointment(aid, p, d, date, time));
	}

	void cancel(int id) {
		for (Appointment a : appointments)
			if (a.id == id) {
				a.status = "Cancelled";
				return;
			}
		System.out.println("Appointment not found!");
	}

	void displayAll() {
		System.out.println("\nPATIENTS");
		patients.forEach(Person::displayDetails);

		System.out.println("\nDOCTORS");
		doctors.forEach(Person::displayDetails);

		System.out.println("\nDEPARTMENTS");
		departments.forEach(Department::display);

		System.out.println("\nAPPOINTMENTS");
		appointments.forEach(Appointment::display);
	}
}

public class MultiSpecialityHospital {
	static Scanner sc = new Scanner(System.in);
	 static Hospital h = new Hospital();

	 static int age() throws InvalidAgeException {
	     int a = sc.nextInt();
	     if (a <= 0 || a > 120)
	         throw new InvalidAgeException("Invalid age!");
	     return a;
	 }

	 public static void main(String[] args) {
	     int ch = 0;

	     do {
	         try {
	             System.out.println("""
	                     
	                     HOSPITAL MANAGEMENT
	                     1. Add Patient
	                     2. Add Doctor
	                     3. Add Department
	                     4. Search Patient
	                     5. Search Doctor
	                     6. Remove Patient
	                     7. Remove Doctor
	                     8. Display Patients
	                     9. Display Doctors
	                     10. Display Departments
	                     11. Book Appointment
	                     12. Cancel Appointment
	                     13. Display Appointments
	                     14. Search Doctor by Speciality
	                     15. Exit
	                     """);

	             System.out.print("Choice: ");
	             ch = sc.nextInt();

	             switch (ch) {

	                 case 1 -> {
	                     System.out.print("ID Name Age Disease BloodGroup: ");
	                     int id = sc.nextInt();
	                     String name = sc.next();
	                     int age = age();
	                     String disease = sc.next();
	                     String blood = sc.next();
	                     h.addPatient(new Patient(id, name, age, disease, blood));
	                 }

	                 case 2 -> {
	                     System.out.print("ID Name Age Speciality Experience Fee: ");
	                     int id = sc.nextInt();
	                     String name = sc.next();
	                     int age = age();
	                     String sp = sc.next();
	                     int exp = sc.nextInt();
	                     double fee = sc.nextDouble();
	                     h.addDoctor(new Doctor(id, name, age, sp, exp, fee));
	                 }

	                 case 3 -> {
	                     System.out.print("Department ID and Name: ");
	                     h.addDepartment(
	                             new Department(sc.nextInt(), sc.next()));
	                 }

	                 case 4 -> {
	                     System.out.print("Patient ID: ");
	                     h.findPatient(sc.nextInt()).displayDetails();
	                 }

	                 case 5 -> {
	                     System.out.print("Doctor ID: ");
	                     h.findDoctor(sc.nextInt()).displayDetails();
	                 }

	                 case 6 -> {
	                     System.out.print("Patient ID: ");
	                     h.removePatient(sc.nextInt());
	                     System.out.println("Patient removed.");
	                 }

	                 case 7 -> {
	                     System.out.print("Doctor ID: ");
	                     h.removeDoctor(sc.nextInt());
	                     System.out.println("Doctor removed.");
	                 }

	                 case 8 ->
	                         h.patients.forEach(Person::displayDetails);

	                 case 9 ->
	                         h.doctors.forEach(Person::displayDetails);

	                 case 10 ->
	                         h.departments.forEach(Department::display);

	                 case 11 -> {
	                     System.out.print("AppointmentID PatientID DoctorID Date Time: ");
	                     h.book(sc.nextInt(), sc.nextInt(), sc.nextInt(),
	                             sc.next(), sc.next());
	                     System.out.println("Appointment booked.");
	                 }

	                 case 12 -> {
	                     System.out.print("Appointment ID: ");
	                     h.cancel(sc.nextInt());
	                 }

	                 case 13 ->
	                         h.appointments.forEach(Appointment::display);

	                 case 14 -> {
	                     System.out.print("Speciality: ");
	                     h.searchSpeciality(sc.next());
	                 }

	                 case 15 ->
	                         System.out.println("Thank you!");

	                 default ->
	                         System.out.println("Invalid choice!");
	             }

	         } catch (PatientNotFoundException |
	                  DoctorNotFoundException |
	                  InvalidAgeException e) {

	             System.out.println("Error: " + e.getMessage());

	         } catch (InputMismatchException e) {

	             System.out.println("Invalid input!");
	             sc.nextLine();
	         }

	     } while (ch != 15);
	 }
}



