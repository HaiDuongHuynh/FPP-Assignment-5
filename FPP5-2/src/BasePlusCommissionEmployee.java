public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getPayment(){
        return baseSalary + super.getPayment();
    }
}
