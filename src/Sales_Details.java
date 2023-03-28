import java.util.Scanner;

public class Sales_Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//creating scanner object
        //creating variable for sales
        String sales_id,seller_name;
        double basic_salary;
        System.out.println("Enter Sales_Id:");
        String SalesId = scanner.nextLine();
        System.out.println("Enter Seller Name:");
        String Seller_Name = scanner.nextLine();
        System.out.println("Enter the Basic Salary:");
        double basic_salary1 = scanner.nextFloat();//using scanner for salary variable
        System.out.println("Enter amount;");//using scanner for amount variable
        double amount = scanner.nextDouble();//
        //if and else statement
        if (amount>=50000){
            System.out.println("Commission is 35%");
        } else if (amount>=30000) {
            System.out.println("Commission is 20%");
        } else if (amount>=20000) {
            System.out.println("Commission is 10%");
        } else if (amount>=10000) {
            System.out.println("Commission is 5%");
        } else if (amount<10000) {
            System.out.println("Commission is 2%");
        }
        else {
            System.out.println("Commission is Zero");
        }


    }
}
