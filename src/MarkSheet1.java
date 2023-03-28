import java.util.Scanner;

public class MarkSheet1 {
    public static void main(String[] args) {
            String student_name;
            int roll_no, maths, eng, sci;
            Scanner scanner = new Scanner(System.in);//create scanner obj
            System.out.println("Enter student_name:");
            student_name = scanner.nextLine();//Scanner obj for String enter student name
            System.out.println("Enter roll_no");
            roll_no = scanner.nextInt();//Scanner obj for roll no
            System.out.println("Enter marks for maths,eng,sci");
            maths = scanner.nextInt();//Scanner obj for subject
            eng = scanner.nextInt();
            sci = scanner.nextInt();
            int total = maths+eng+sci;
            System.out.println("Total_Marks is:"+(maths+eng+sci));//total of 3 sub
            int percentage = (total/3);
            System.out.println("Percentage is:" + (total/3));
            //if 3 sub marks more than 35 then pass
            if ((maths>=35) && (sci>=35) && (eng>=35)){
                System.out.println("You are Pass");
            } else {
                System.out.println("You are Fail");
            }


    }

}
















