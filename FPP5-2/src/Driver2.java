public class Driver2 {

    public static void main(String[] args) {
        Employee e1 = new CommissionEmployee("Tom", "Huynh","123456",200,0.4);
        Employee e2 = new HourlyEmployee("Benedict", "Cucumber", "234567",10,36);
        Employee e3 = new SalariedEmployee("John","Cena","345678", 12);
        Employee e4 = new BasePlusCommissionEmployee("Joey", "Bazinga","456789",100,0.3,50);
        Employee e5 = new CommissionEmployee("Connor", "Tungston","567890",300,0.2);
        Employee[] employees = {e1,e2,e3,e4,e5};
        double totalSum = 0;
        for(Employee e: employees){
            System.out.println(e.toString());
            totalSum += e.getPayment();
        }
        System.out.println("Total salaries of all the employees: $" + totalSum);
    }
}
