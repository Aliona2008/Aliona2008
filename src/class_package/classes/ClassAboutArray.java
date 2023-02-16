package class_package.classes;

public class ClassAboutArray {
    public static void main(String[] args) {
        String[] nameOfClassmatesSunSystems = {
           "Earth",
           "Mars",
           "Mercury",
           "Saturn",
           "Jupiter",
           "Venus",
           "Neptune",
           "Uranus"

        };
       // System.out.println(nameOfClassmatesSunSystems[0]);
        int[] myArray;
        myArray = new int[3];//длина массива
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        System.out.println("Element at index 0: " + myArray[0]);
        String myString = "Ivan Ivanovich Ivanov";
        String[] words = myString.split("");
       // System.out.println(Arrays.toString(words));

        char[] charArray = "Ivan".toCharArray();
        //System.out.println(charArray[0]);

        char c1 = 'A';
       // System.out.println(c1);
        char c2 = 63;
        //System.out.println(c2);

        String[][] names = {
                {"Mr.", "Mrs.", "Ms.", "Miss."},
                {"Ivanov", "Jones", "Sidorov"}
        };
        //Ms.Jones
        //System.out.println(names[0][2] + names[1][1]);
    //Mr.Sidorov
        //System.out.println("Hello" + ", " + names[0][0] + names[1][2] + "!");


    }
}
