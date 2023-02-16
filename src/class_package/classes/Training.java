package class_package.classes;

import java.util.Scanner;

public class Training {

    public static void  main(String[] args) {
        /*
        System.out.println("Enter your number:");
        Scanner scan = new Scanner(System.in);
        int userTeperatureInCelsius = scan.nextInt();
        System.out.println(converFromCelsiusToKelvin(userTeperatureInCelsius));
        System.out.println(userTeperatureInCelsius + " C= " +converFromCelsiusToFahrenheit(userTeperatureInCelsius) + "F");
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int userFirstNumber = scan.nextInt();
        System.out.println("Enter the second number:");
        int userSecondNumber = scan.nextInt();
        System.out.println("The biggest of " + userFirstNumber +
                           " and " + userSecondNumber + " = "
                            + compareMagnitudeOfNumbers(userFirstNumber, userSecondNumber));
    }


    public static int converFromCelsiusToFahrenheit(int celsius){
        return celsius * 9 / 5 + 32;
    }

    public static double converFromCelsiusToKelvin(int userTeperatureInCelsius){
        return userTeperatureInCelsius + 273.16;
    }
    public static int compareMagnitudeOfNumbers(int firstNumber, int secondnumber){
           /*
            if(Math.abs(firstNumber) > Math.abs(secondnumber)) {
                return firstNumber;
            }else{
                return secondnumber;
            }*/
        return Math.abs(firstNumber) > Math.abs(secondnumber) ? firstNumber : secondnumber;
    }

}
