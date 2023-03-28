import java.util.Scanner;
 public class MarkSheet {
        public static void main(String[] args) {
            String student_name;//declare variable
            int roll_no, maths, eng, sci;
            Scanner scanner = new Scanner(System.in); //create scanner object for scanner class
            System.out.println("Enter student_name:");
            student_name = scanner.nextLine();//create student name object for scanner class
            System.out.println("Enter roll_no");
            roll_no = scanner.nextInt();
            System.out.println("Enter marks for maths,eng,sci");
            maths = scanner.nextInt();
            eng = scanner.nextInt();
            sci = scanner.nextInt();
            int total = maths+eng+sci;
            System.out.println("Total_Marks is:"+(maths+eng+sci));//for total marks prints
            int percentage = (total/3);
            System.out.println("Percentage is:" + (total/3));
            //if or else condition using
            if (percentage>=35)
            {
                System.out.println("You are Pass");
            }
            if (percentage>=80){
                System.out.println("Grade-A+");
            } else
            if (percentage>=60) {
                System.out.println("Grade-A");
            } else if (percentage>=50) {
                System.out.println("Grade-B");
            } else if (percentage>=35) {
                System.out.println("Grade-C");
            }
            else {
                System.out.println("You are Fail");
            }



        }






    }
    

