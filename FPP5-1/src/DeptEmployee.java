import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    LocalDate hireDate;
    private double salary;
    public DeptEmployee(String name, LocalDate hireDate,double salary){
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName(){return name;}
    public void setName(String n){name = n;}
    public LocalDate getHireDate(){return hireDate;}
    public void setHireDate(LocalDate d){hireDate = d;}
    public double computeSalary(){return salary;}
    public void setSalary(double s){salary = s;}
}
