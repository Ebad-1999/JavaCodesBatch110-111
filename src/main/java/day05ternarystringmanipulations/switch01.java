package day05ternarystringmanipulations;



import java.util.Scanner;

public class switch01 {
    public static void main(String[] args) {


        //Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
        //            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"


        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the country name");

        String country = input.nextLine().toLowerCase();

        switch(country){  //Note inside the switch parenthesis you can use just  int, byte, short, char, String, data type.
                          //Note boolean, long, float, double, can't use in switch statement.
            case "america":
                System.out.println("US");
                 break;
            case "england":
                System.out.println("UK");
                break;

            case "germany":
                System.out.println("UK");
                break;
            case "turkey":
                System.out.println("TR");
                break;

            case "india":
                System.out.println("IN");
                break;

            case "peru":
                System.out.println("PE");
                break;

            case "spain":
                System.out.println("ES");
                break;

            case "bulgaria":
                System.out.println("BG");
                break;

            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");

                break;
            default:
                System.out.println("No information about the country");



        }
    }


}
