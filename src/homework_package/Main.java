package homework_package;

import class_package.class_10.Person;
import class_package.class_10.Student;
import class_package.class_10.Tutor;

public class Main {
    public static void main(String[] args) {
        Phone firstPhone = new Phone("Sumsung", 12,5,  1);

        Android firstAndroid = new Android("Sumsung", 12, 5, 1, 2);

        firstAndroid = new Android("Sumsung", 12, 5, 1, 2);
        System.out.println("new phoen: " + firstAndroid.getModel() + firstAndroid.getDisplay() + firstAndroid.getSizeRAM());
    }
}
