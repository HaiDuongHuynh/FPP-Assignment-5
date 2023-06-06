public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String toString(){
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socialSecurityNumber + "]";
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurityNumber(){return socialSecurityNumber;}

    public abstract double getPayment();
}
