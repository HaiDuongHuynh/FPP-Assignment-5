public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public double getGrossSales(){return grossSales;}
    public double getCommissionRate(){return commissionRate;}
    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public double getPayment(){
        return grossSales*commissionRate;
    }
}
