package homework_package;

import java.util.Arrays;

public class ClassAboutArrayHomework {
        public static void main(String[] args) {
            int[] arrayOfNumbers = {1, 2, 3, 4, 5};
            /*arrayOfNumbers[0] = (int) Math.pow(arrayOfNumbers[0], 2);
            arrayOfNumbers[1] = (int) Math.pow(arrayOfNumbers[1], 2);
            arrayOfNumbers[2] = (int) Math.pow(arrayOfNumbers[2], 2);
            arrayOfNumbers[3] = (int) Math.pow(arrayOfNumbers[3], 2);
            arrayOfNumbers[4] = (int) Math.pow(arrayOfNumbers[4], 2);
            System.out.println(Arrays.toString(arrayOfNumbers));*/
            for (int i=0; i< arrayOfNumbers.length; i++){
                arrayOfNumbers[i] = (int) Math.pow(arrayOfNumbers[i], 2);
            }
            System.out.println(Arrays.toString(arrayOfNumbers));
             /*for (int i=0; i< arrayOfNumbers.length; i++){
                arrayOfNumbers[i] = (int) Math.pow(arrayOfNumbers[i], 2);
            }
            System.out.println(Arrays.toString(arrayOfNumbers));
            */
            for (int i = 0; i < arrayOfNumbers.length; i++){
                if (arrayOfNumbers[i] %2 == 0){
                    System.out.println(arrayOfNumbers[i]);
                }
            }
        }
}

