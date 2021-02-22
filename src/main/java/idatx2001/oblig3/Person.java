package idatx2001.oblig3;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Sets first name.
     * @param enteredFirstName
     */
    public void setFirstName(String enteredFirstName) {
        this.firstName = enteredFirstName;
    }

    /**
     * Sets last name.
     * @param enteredLastName
     */
    public void setLastName(String enteredLastName) {
        this.lastName = enteredLastName;
    }

    /**
     * Sets social security number.
     * @param enteredNumber
     */
    public void setSocialSecurityNumberNumber(String enteredNumber) {
        this.socialSecurityNumber = enteredNumber;
    }

    /**
     * Returns first name.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns last name.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns Social security number.
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * Returns full name of person.
     */
    public String getFullName() {
        return (this.firstName + " " + this.lastName);
    }

    /**
     * Overrides the toString() method. Returns the parameters.
     */
    public String toString() {
        return this.firstName+" "+this.lastName+" "+this.socialSecurityNumber;
    }
}
