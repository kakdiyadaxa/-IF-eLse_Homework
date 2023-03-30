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
        System.out.println("Enter sales amount:");//using scanner for amount variable
        double sales_amount = scanner.nextDouble();//
        //if and else statement
        //if amount is more than 50000
        if (sales_amount>=50000){
            System.out.println("Your commission is:"+(sales_amount*35/100));
            //if amount is more than 30000
        } else if (sales_amount>=30000 && sales_amount<50000) {
            System.out.println("Your commission is:"+(sales_amount*20/100));
            //if amount is more than 20000
        } else if (sales_amount>=20000 && sales_amount<30000) {
            System.out.println("Your commission is:"+(sales_amount*10/100));
            //if amount is more than 10000
        } else if (sales_amount>=10000 && sales_amount<20000) {
            System.out.println("Your commission is: "+(sales_amount*5/100));
            //if amount is less than 10000
        } else if (sales_amount<10000){
            System.out.println("Your commission is:"+(sales_amount*2/100));
        }
        else {
            System.out.println("Your commission is Zero:");
        }

    }
}
