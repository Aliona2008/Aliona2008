package class_package.class_animals;

public class Fish extends Animals{private Boolean isMamal;
    public Fish(String family, String genus, String species,Boolean doesHaveLimbs, Boolean isMamal) {
        super(family, genus, species, doesHaveLimbs);
        this.isMamal = isMamal;
    }

    public Boolean getMamal() {
        return isMamal;
    }

    public void setMamal(Boolean mamal) {
        isMamal = mamal;
    }

    @Override
    public String voice() {
        return super.voice() + ": буль-буль";
    }}

}

