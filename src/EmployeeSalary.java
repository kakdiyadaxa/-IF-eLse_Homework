import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creating scanner obj
        //Creating obj for Employee
        String Employee_name;
        int Basic_salary,HRA,TA,DA,PF,Gross_salary;
        System.out.println("Enter Employee_id:");
        String employee_id = scanner.nextLine();//using obj scanner for employee_id variable
        System.out.println("Enter Name:");
        String Name = scanner.nextLine();//using obj scanner for Name variable
        System.out.println("Enter the basic salary:");
       int basic_salary = scanner.nextInt();//using scanner for basic salary variable
        HRA = (basic_salary*10)/100;//creating objects variables
        System.out.println("HRA:"+(basic_salary*10)/100);
        DA = (basic_salary*8)/100;
        System.out.println("DA:"+(basic_salary*8)/100);
        TA = (basic_salary*9)/100;
        System.out.println("TA:"+(basic_salary*9)/100);
        PF = (basic_salary*20)/100;
        System.out.println("PF:"+(basic_salary*20)/100);
        Gross_salary = (basic_salary+HRA+TA+DA-PF);//Creating Gross salary
        System.out.println("Gross salary is:"+(basic_salary+HRA+TA+DA-PF));//For printing Gross salary
    }

}
