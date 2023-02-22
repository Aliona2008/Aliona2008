package class_package.class_fish;

public class Fish implements Voicable{
    private String genus;
    private String subspecies;

    public Fish (String genus, String subspecies) {
        this.genus = genus;
        this.subspecies = subspecies;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSubspecies() {
        return subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.subspecies = subspecies;
    }

    @Override
    public String voice() {
        return "All fish eat algae\n" +
                "Fish breathe underwater";
    }
}
