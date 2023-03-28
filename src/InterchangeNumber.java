import java.util.Scanner;

public class InterchangeNumber {
    public static void main(String[] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in); //create scanner obj
        System.out.println("Enter the value of x and Y");
        x = scanner.nextInt();//using scanner obj for variable
        y = scanner.nextInt();
        System.out.println("Before changing numbers:"+x+" "+y);
        //changing
        z = x;
        x = y;
        y = z;
        System.out.println("After changing numbers:"+x+" "+y);



    }
}
