import java.util.Scanner;
public class AtoFCityName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//object of scanner class
        System.out.println("Please enter an alphabet:");
        String alphabet = scanner.nextLine();//object scanner for alphabet//create variable
        //if alphabet is a or A then print city name Ahmedabad
        if (alphabet.equalsIgnoreCase("a")){
            System.out.println("Ahmedabad");
        }
        //if alphabet b or B then print city name Baroda
        else if (alphabet.equalsIgnoreCase("b")){
            System.out.println("Baroda");
        }
        //if alphabet c or C then print city name Chile
        else if (alphabet.equalsIgnoreCase("c")){
            System.out.println("Chile");
        }
        //if alphabet d or D then print city name Daman
        else if (alphabet.equalsIgnoreCase("d")){
            System.out.println("Daman");
        }
        //if alphabet e or E then print city name Erandol
        else if (alphabet.equalsIgnoreCase("e")){
            System.out.println("Erandol");
        }
        //if alphabet e or f then print city name F
        else if (alphabet.equalsIgnoreCase("f")){
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid alphabet");
        }





    }


    }














