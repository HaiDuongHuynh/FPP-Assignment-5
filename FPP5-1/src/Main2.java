import java.time.LocalDate;
import java.util.Scanner;
import static java.lang.System.exit;

public class Main2 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Yukong Zhang", LocalDate.of(1998,3,3),8000,5);
        Professor p2 = new Professor("Samuel Rodriezl", LocalDate.of(2000,4,6),7500,4);
        Professor p3 = new Professor("Hikiri Roger", LocalDate.of(2001,11,20),6000,3);
        Secretary s1 = new Secretary("John Doe", LocalDate.of(1998,12,11),3300,10);
        Secretary s2 = new Secretary("bob", LocalDate.of(2002,11,30),1500,30);
        DeptEmployee[] department = new DeptEmployee[]{p1,p2,p3,s1,s2};
        double sumSalary = 0;
        System.out.println("Do you want to see the sum of all Professor and Secretary's salary?Y/N");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.equals("Y")) {
            for (DeptEmployee e : department) {
                sumSalary += e.computeSalary();
            }
            System.out.println("The sum salary of all Professor and Secertary: "+ sumSalary);
        }
        else{exit(0);}
    }
}
