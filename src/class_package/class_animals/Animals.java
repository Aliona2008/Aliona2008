package class_package.class_animals;

import java.util.Objects;

public class Animals implements Voicable{
    private String family;
    private String genus;
    private String species;
    private Boolean doesHaveLimbs;

    public Animals(String family, String genus, String species) {
        this.family = family;
        this.genus = genus;
        this.species = species;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Boolean getDoesHaveLimbs() {
        return doesHaveLimbs;
    }

    public void setDoesHaveLimbs(Boolean doesHaveLimbs) {
        this.doesHaveLimbs = doesHaveLimbs;
    }

    @Override
    public String voice() {
        return "Я умею издовать звуки";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return Objects.equals(getFamily(), animals.getFamily()) && Objects.equals(getGenus(), animals.getGenus()) && Objects.equals(getSpecies(), animals.getSpecies()) && Objects.equals(getDoesHaveLimbs(), animals.getDoesHaveLimbs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamily(), getGenus(), getSpecies(), getDoesHaveLimbs());
    }
}
