import java.util.Scanner;

public class LeapYear{

    public static void main(String[] args) {
        int year;
        System.out.println("Please enter the year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();//scanner object use for year variable

        //if year is divided by 4 and if year is century and if year is divided by 400 then it is a leap year
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Specified year is a leap year");
        } else
        {
            System.out.println("Specified year is not a leap year");
        }
    }
}

















