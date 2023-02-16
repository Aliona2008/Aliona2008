package class_package.class_10;

public class Tutor extends Person implements Callable {

    private  int numberLessons;

    public Tutor(String name, String surname, int age, String favouriteFood, String phoneNumber, int numberLessons) {
        super(name, surname, age, favouriteFood, phoneNumber);
        this.numberLessons = numberLessons;
    }


    public int getNumberLessons() {
        return numberLessons;
    }

    public void setNumberLessons(int numberLessons) {
        this.numberLessons = numberLessons;
    }

    @Override
    public String call() {
        return "Call tutor " + getName() + " can by number " + getPhoneNumber() + " (номера совпадают)";
    }

    public String call(Tutor anotherTutor){
        if (this.getPhoneNumber().equals(anotherTutor.getPhoneNumber())){
           return "Невозможно позвонить самому себе (номер совпадает)";
        }else{
            return "Тьютор" + this.getName()
                    + " " + this.getSurname()
                    + "  звонит тьютору"
                    + anotherTutor.getName()
                    + " " + anotherTutor.getSurname();
        }

    }
}
