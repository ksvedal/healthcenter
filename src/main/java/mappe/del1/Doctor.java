package mappe.del1;

public abstract class Doctor extends Employee {

    protected Doctor(String socialSecurityNumber, String firstName, String lastName) {
        super(socialSecurityNumber, firstName, lastName);
    }

    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
