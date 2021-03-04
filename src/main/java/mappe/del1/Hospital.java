package mappe.del1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hospital {
    private final String hospitalName = "Gob";
    private ArrayList<Department> departments;


    /**
     * Constructor
     * @param hospitalName
     */
    public Hospital(String hospitalName) {
        departments = new ArrayList<>();
    }

    /**
     * Return name of hospital.
     */
    public String getHospitalName() {
        return this.hospitalName;
    }

    /**
     * Returns a list of all departments
     */
    public List<Department> getDepartments() {
        int i = 0;
        for (Iterator<Department> it = departments.iterator(); it.hasNext();) {
            Department department = it.next();
            departments.add(i, department);
        }
        return departments;
    }

    /**
     * Adds department to list of departments.
     * @param department
     */
    public void addDepartment(Department department) {
        this.departments.add(department);
    }
}