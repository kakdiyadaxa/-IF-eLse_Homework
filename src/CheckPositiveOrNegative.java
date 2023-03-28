import java.util.Scanner;

public class CheckPositiveOrNegative {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);//object of scanner class
        System.out.println("Enter a number:");
        number = scanner.nextInt();//reading number
        //checks the number is greater than 0 or not
        if (number>0){
            System.out.println("The number is positive.");
        }
        //checks the number is less than 0 or not
        else if (number<0) {
            System.out.println("The number is negative.");
        }
        //when two conditions false
        else {
            System.out.println("The number is Zero.");
        }


    }

}
