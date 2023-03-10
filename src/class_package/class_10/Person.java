package class_package.class_10;

public class Person implements Printable{
    private String name;
    private String surname;
    private int age;
    private String favouriteFood;
    private String phoneNumber;

    public Person(String name, String surname, int age, String favouriteFood, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favouriteFood = favouriteFood;
        this.phoneNumber = phoneNumber;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String print() {
        return String.format("Имя: %s;\nФамилия: %s;\nНомер телефона: %s.", name, surname, phoneNumber);
    }
}
