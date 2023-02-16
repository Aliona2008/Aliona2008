package class_package.class_10;

public class Student extends Person implements Callable{
  //extends - что-то унаследует
    private int  grade;
//private - не можем к нему стучаться кроме класса Student

    public Student(String name, String surname, int age, String favouriteFood, String phoneNumber) {
        super(name, surname, age, favouriteFood, phoneNumber);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String call() {
        return "Call student " + getName() + " can by number " + getPhoneNumber();
        }

    public String call(Person person) {
         if (this.getPhoneNumber().equals(person.getPhoneNumber())){
                return "Невозможно совершит звонок: номера совподают.";
            }else{
                return "Студент " + this.getName()
                        + " " + this.getSurname()
                        + "  звонит "
                        + person.getName()
                        + " " + person.getSurname();
            }

    }
    @Override
    public String print() {
        return super.print() + "\nКласс: " + grade;
    }
}
