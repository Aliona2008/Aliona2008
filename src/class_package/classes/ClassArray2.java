package class_package.classes;

import java.util.Arrays;
import java.util.Random;

public class ClassArray2 {
        public static void main(String[] args) {
            int[] arrayOfNumbers = {1, 2, 3, 4, 5};

            int sumOfNumbers = 0;

            for (int i = 0; i < arrayOfNumbers.length; i++){
                sumOfNumbers += arrayOfNumbers[i];
            }
            System.out.println(sumOfNumbers);
            int[] arrayWithRandomNumbers = createArrayWithRandomNumbers(10);
            System.out.println(Arrays.toString(sortArrayToOddNumbers(arrayWithRandomNumbers)));
        }


        public static int[] createArrayWithRandomNumbers(int lengthOfArray){
           int[] arrayOfNumbers = new int[lengthOfArray];
           for (int i = 0; i < arrayOfNumbers.length; i++) {
               Random random = new Random();
               arrayOfNumbers[i] = random.nextInt(100);
           }
           return arrayOfNumbers;
        }
    public static int[] sortArrayToOddNumbers(int[] arrayOfNumbers) {
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] % 2 == 0) {
                arrayOfNumbers[i] = 0;
            }
        }
        return arrayOfNumbers;
    }
}
