package model;

import java.util.List;

public class Sensor {

    private int netAddress;
    private List<Volume> volumes;

    public int getNetAddress() {
        return netAddress;
    }

    public void setNetAddress(int netAddress) {
        this.netAddress = netAddress;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }
}
