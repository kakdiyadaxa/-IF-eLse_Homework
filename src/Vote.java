import java.util.Scanner;

public class Vote {
    Scanner scanner = new Scanner(System.in);
        public void eligibleEorVote()
        {     //acknowledge yhe user what to enter
            System.out.println("Please enter your age ");

            //storing age in variable using scanner object
            int age =scanner.nextInt();
            if (age>=18) {
                System.out.println("You are eligible for vote as your age is :" +age);

            }else {
                System.out.println("You are Not eligible for vote as your age is:"+age);
            }
        }
        public static void main(String[] args) {
            //creating class object to call not-static method in static area
            Vote vote = new Vote();

            //calling method using class object
            vote.eligibleEorVote();
        }
}

