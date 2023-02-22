package class_package.class_fish;

public class Bone extends Fish implements Voicable{

    private String structureOfFish;
    public Bone(String view, String subspecies, String peculiarities) {
        super(view, subspecies);
        this.structureOfFish = structureOfFish;
    }

    public String getStructureOfFish() {
        return structureOfFish;
    }

    public void setStructureOfFish(String structureOfFish) {
        this.structureOfFish = structureOfFish;
    }
    public String voice() {
        return "Имеют парные плавники\n"
                + "Рот этих рыб образован захватывающими челюстями с зубами," +
                " жабры расположены на жаберных дугах с внутренней скелетной опорой, " +
                "а ноздри парные";
    }
}
