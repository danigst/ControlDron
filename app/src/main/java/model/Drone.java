package model;

public class Drone {
    private String id;
    private String model;
    private boolean isOn;
    private int batteryLevel;
    private double speed;
    private double altitude;

    public Drone(String id, String model, boolean isOn, int batteryLevel,
          double speed, double altitude){
        this.id = id;
        this.model = model;
        this.isOn = isOn;
        this.batteryLevel = batteryLevel;
        this.speed = speed;
        this.altitude =altitude;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
       return id;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }
    public  boolean getIsOn(){
        return isOn;
    }
    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }
    public int getBatteryLevel(){
        return this.batteryLevel;
    }
    public void setAltitude(double altitude){
        this.altitude = altitude;
    }
    public double getAltitude(){
        return altitude;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    public boolean canFly(){
        boolean can = batteryLevel >= 30;
        return isOn && can;
    }

    public void updateParametrosDrone(double altitude, double speed, int batteryLevel, boolean isOn){
        this.altitude = altitude;
        this.speed = speed;
        this.batteryLevel = batteryLevel;
        this.isOn = isOn;
    }
}
