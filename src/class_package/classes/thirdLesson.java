package class_package.classes;

import java.util.Scanner;

public class thirdLesson {
    public static void main(String[] args) {
      /*  for
        System.out.println("1\n2\n3");

        //1 2 3 4 5
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + 3 * i);
        }
*/
        for (int i = 2; i <= 20; i+=2){
            System.out.print(i + " ");
        }

/*
        //факториал
        //3! = 1*2*3
        //10! = 1*2*3*4...*9*10
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int userName = scanner.nextInt();
        int resultFactorial = 1;

        for (int i = 1; i <= userName; i++) {
            resultFactorial *= i;
        }
        System.out.println(userName + "! = " + resultFactorial);


    }
}
 // i++ - инкримент
// i-- - декремент