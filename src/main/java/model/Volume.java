package model;

public class Volume {
    private int step;
    private int value;
    private int netAddress;

    public Volume(int step, int value, int netAddress) {
        this.step = step;
        this.value = value;
        this.netAddress = netAddress;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(int netAddress) {
        this.netAddress = netAddress;
    }
}
