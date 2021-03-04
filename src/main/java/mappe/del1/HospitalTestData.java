package mappe.del1;

import mappe.del1.Nurse;
import mappe.del1.GeneralPractitioner;
import mappe.del1.Surgeon;

import java.util.ArrayList;
import java.util.List;

public class HospitalTestData {

    private static Hospital hospital;

    /**
     * Fills the hospital provided as a parameter with
     * departments and some employees and patients.
     *
     * @param hospital the hospital to be populated with testdata
     */
    public static void fillRegisterWithTestData(final Hospital hospital) {

        // Add some departments
        Department emergencyRoom = new Department("Akutten");
        emergencyRoom.addEmployee(new Employee("12321321", "Primtallet", "Bok"));
        emergencyRoom.addEmployee(new Employee("12321321", "DelFinito", "Bok"));
        emergencyRoom.addEmployee(new Nurse("12312312", "Mortis", "Bok"));
        emergencyRoom.addEmployee(new GeneralPractitioner("12321213", "Gnito", "Bok"));
        emergencyRoom.addEmployee(new Surgeon("123132312", "Gnito", "Bok"));
        emergencyRoom.addPatient(new Patient("123123312", "Teknologi", "Bok"));
        emergencyRoom.addPatient(new Patient("12312312", "Ralt", "Bok"));
        //hospital.addDepartment(emergencyRoom);

        Department childrensPolyclinic = new Department("Barne poliklinikk");
        childrensPolyclinic.addEmployee(new Employee("Salti", "Kaffen", "Bok"));
        childrensPolyclinic.addEmployee(new Employee("Nidel V.", "Elvefølger", "Bok"));
        childrensPolyclinic.addEmployee(new Nurse("Anton", "Nym", "Bok"));
        childrensPolyclinic.addEmployee(new GeneralPractitioner("Gene", "Sis", "Bok"));
        childrensPolyclinic.addPatient(new Patient("Nanna", "Na", "Bok"));
        childrensPolyclinic.addPatient(new Patient("Nora", "Toriet", "Bok"));
        //hospital.addDepartment(childrensPolyclinic);

        System.out.println(emergencyRoom.getDepartmentName());
        System.out.println("\nEmployees:");
        System.out.println(emergencyRoom.getEmployees());
        System.out.println("\nPatients:");
        System.out.println(emergencyRoom.getPatients());

    }

    public static void main(String[] args) {
        fillRegisterWithTestData((hospital));
    }

}
