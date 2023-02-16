package homework_package;

public class Android extends Phone{

    private int amountOfSIMCards;

    public Android(String model, float display, int sizeRAM, int isDualCameraSystem, int amountOfSIMCards) {
        super(model, (int) display,  sizeRAM,  isDualCameraSystem);
        this.amountOfSIMCards = amountOfSIMCards;
    }

    public int getAmountOfSIMCards() {
        return amountOfSIMCards;
    }

    public void setAmountOfSIMCards(int amountOfSIMCards) {
        this.amountOfSIMCards = amountOfSIMCards;
    }
}
