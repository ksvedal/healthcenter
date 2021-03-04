package mappe.del1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String departmentName;
    private ArrayList<Patient> patients;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.patients = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void setDepartmentName(String newDepartmentName) {
        this.departmentName = newDepartmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Patient> getPatients() {
        return this.patients;
    }

    public void addPatient(Patient patient) {
        this.patients.add(patient);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName) &&
                patients.equals(that.patients) &&
                employees.equals(that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, patients, employees);
    }

    public void remove(Person person) {
        //TODO: fill in
    }
}
