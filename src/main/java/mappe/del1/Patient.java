package mappe.del1;

public class Patient extends Person implements Diagnosable {
    private String diagnosis = "";

    protected Patient(String socialSecurityNumber, String firstName, String lastName) {
        super(socialSecurityNumber, firstName, lastName);
    }

    protected String getDiagnosis() {
        return this.diagnosis;
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
