public class SalariedEmployee extends Employee{
    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getPayment(){
        return weeklySalary;
    }
}
