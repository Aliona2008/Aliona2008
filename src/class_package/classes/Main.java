package class_package.classes;

import java.util.Scanner;
public class Main {
    public static <Scaner> void main(String[] args) {
        System.out.println("Hello, guys");

        //int number = 16;
       // System.out.println(number);

       // int first = 4;
       // int second = 7;

        //int big = 0;

       // if (first > second) {
          // big = first;
       // } else {
          // big = second;
        //}
        //System.out.println(big);

        //ternar
        //int big2 = first > second ? first : second;
       // System.out.println(big2);
       // System.out.println("Больше из двух чисел: " + first + " и " + second + " : " + big2);
        //System.out.println(String.format("Больше из двух чисел %d и %d : %d", first, second, big2));

       // %s - String
        // %d -12
//         %.f , %.2f
        //int month = 11;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of month");
        int month = scan.nextInt();
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(monthString);
    }

}