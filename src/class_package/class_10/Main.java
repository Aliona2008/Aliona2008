package class_package.class_10;

public class Main {
    public static void main(String[] args) {
       // Person firstPerson = new Person("Ivan", "Ivanov", 12);
        Person firstPerson = new Person(
                "Anna",
                "James",
                12,
                "pizza",
                "0976854560"
        );
        //System.out.println(firstPerson.getPhoneNumber());

        Person secondPerson = new Person(
                "Ivan",
                "Ivanov",
                20,
                "pizza",
                "5368710452"
        );
        secondPerson.setFavouriteFood("burger");
        //System.out.println(secondPerson.getFavouriteFood());

        //DRY - don't repeat yourself
        Student firstStudent = new Student("Ruslan", "Ruslanov",15, "potatoes", "78934527407");
        //System.out.println(firstStudent.getAge());
       // System.out.println(firstStudent.getGrade());

        Tutor tutor = new Tutor("Ann", "Petrova", 14, "salad", "9846729402", 7);
        Tutor tutor2 = new Tutor("Aliona", "Ivanova", 13, "pizza", "9846729402", 8);
       // System.out.println(tutor.call(tutor2));

        System.out.println(firstStudent.call(tutor2));

        //System.out.println(firstStudent.print());
        System.out.println(tutor.print());
    }
}

/*
add String phoneNumber to Person.class
add interface Callable with call() method
add interface Printable with print() method
 */
