package class_package.class_fish;

public class Cartilaginous extends Fish implements Voicable{
    private String peculiarities;
    public Cartilaginous(String view, String subspecies, String peculiarities) {
        super(view, subspecies);
        this.peculiarities = peculiarities;
    }

    public String getPeculiarities() {
        return peculiarities;
    }

    public void setPeculiarities(String peculiarities) {
        this.peculiarities = peculiarities;
    }


    public String voice() {
        return " Хрящевой скелет\n"
                + "Отсутствие плавательного пузыря\n"
                + "Lack of gill covers\n"
                + "Fins are horizontal\n"
                + "The mouth opening is located ventrally\n"
                + "The metabolic product is urea\n"
                + peculiarities;
    }

}
