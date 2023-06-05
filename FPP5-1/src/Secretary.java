import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overtimeHours;

    public Secretary(String name, LocalDate hireDate,double salary, double overtimeHours){
        super(name,hireDate,salary);
        this.overtimeHours = overtimeHours;
    }

    public void setOvertimeHours(double o){overtimeHours = o;}
    public double getOvertimeHours(){return overtimeHours;}
    public double computeSalary(){
        return super.computeSalary()+(12*overtimeHours);
    }
}
