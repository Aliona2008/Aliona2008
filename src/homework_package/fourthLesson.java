package homework_package;

public class fourthLesson {
    public class ClassAboutLoopWhile {
        public static void main(String[] args) {

            //2 3 5 9 17 33
            int number = 2;
            while (number <= 33) {
                System.out.print(number + " ");
                number += 2;
            }
            int firstNum = 2;
            int secondNum = 3;
            int currentNum;
            System.out.print(firstNum + " " + secondNum + " ");
            for (int i = 9; i <= 11; i++) {
                currentNum = firstNum + secondNum;
                System.out.print(currentNum + " ");
                firstNum = secondNum;
                secondNum = currentNum;
            }

        }
    }
}
