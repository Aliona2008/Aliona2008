package class_package.class_fish;

public class Main {

    public static void main(String[] args) {
        Cartilaginous fish1 = new Cartilaginous("fish", "cartilaginous","new peculiarities");
        System.out.println(fish1.voice());
        Bone fish2 = new Bone("fish", "bone", "new peculiarities");
        System.out.println(fish2.voice());
    }
}
