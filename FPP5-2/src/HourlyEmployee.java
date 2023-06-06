public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getPayment(){
        return wage*hours;
    }
}
