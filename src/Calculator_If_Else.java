import java.util.Scanner;

public class Calculator_If_Else {
    //using main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//taking input from the user the Scanner class
        System.out.println("Enter the first and the Second number:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // selecting numbers for the calculations
        System.out.println("Choose and Enter the type of operator you want to perform (+,-,*,/):");
        char number = scanner.next().charAt(0);// taking numbers
        if (number == '+') {
            System.out.println("You have selected Addition:"+(a+b));
        } else if (number == '-') {
            System.out.println("You have selected Subtraction:"+(a-b));
        } else if (number == '*') {
            System.out.println("You have selected Multiplication:"+(a*b));
        } else if (number == '/') {
            System.out.println("You have selected Division:"+(a/b));
        }
        else {
            System.out.println("invalid symbol:");
        }

    }

}
