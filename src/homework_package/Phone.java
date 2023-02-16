package homework_package;

public class Phone implements MemoryUsable{
    private String  model;
    private float display;
    private int sizeRAM;
    private  boolean isDualCameraSystem;

    public Phone(String model, float display, int sizeRAM, boolean isDualCameraSystem) {
        this.model = model;
        this.display = display;
        this.sizeRAM = sizeRAM;
        this.isDualCameraSystem = isDualCameraSystem;
    }

    public Phone(String sumsung, int display, int sizeRAM, int isDualCameraSystem) {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getDisplay() {
        return display;
    }

    public void setDisplay(float display) {
        this.display = display;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    public boolean isDualCameraSystem() {
        return isDualCameraSystem;
    }

    public void setIsDualCameraSystem() {
        isDualCameraSystem = isDualCameraSystem;
    }

    @Override
    public String useMemory() {
        if (this. (getSizeRAM).equals(anotherPhone.getSizeRAM()))
    } else{
            return "Ты можешь использовать память, пока она не заполнит" + this.getSizeRAM()
        }
    }
}
