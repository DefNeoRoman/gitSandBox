package model;

import java.util.List;

public class TableObject {

    private int calibrationMethod;
    private int calibrationStep;
    private String netAddresses;
    private List<String> values;
    private List<Sensor> sensorList;

    public TableObject(int calibrationMethod,
                       int calibrationStep,
                       String netAddresses,
                       List<String> values,
                       List<Sensor> sensorList) {
        this.calibrationMethod = calibrationMethod;
        this.calibrationStep = calibrationStep;
        this.netAddresses = netAddresses;
        this.values = values;
        this.sensorList = sensorList;
    }

    public int getCalibrationMethod() {
        return calibrationMethod;
    }

    public void setCalibrationMethod(int calibrationMethod) {
        this.calibrationMethod = calibrationMethod;
    }

    public int getCalibrationStep() {
        return calibrationStep;
    }

    public void setCalibrationStep(int calibrationStep) {
        this.calibrationStep = calibrationStep;
    }

    public String getNetAddresses() {
        return netAddresses;
    }

    public void setNetAddresses(String netAddresses) {
        this.netAddresses = netAddresses;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public List<Sensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(List<Sensor> sensorList) {
        this.sensorList = sensorList;
    }
}
