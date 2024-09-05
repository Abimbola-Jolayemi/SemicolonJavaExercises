package AirConditionerApp;

public class AirConditioner {
    private int temperature;
    private boolean isOn;

    public AirConditioner() {
        this.temperature = 24;
        this.isOn = false;
    }
    
    public boolean turnOn() {
        this.isOn = true;
        return isOn;
    }

    public boolean turnOff() {
        this.isOn = false;
        return isOn;
    }

    public void setTemperature(int temperature) {
        if (isOn && temperature >= 16 && temperature <= 30) {
            this.temperature = temperature;
        }
    }
    public void increaseTemperature() {
        if (isOn && temperature < 30) {
            temperature++;
        }
    }
    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) {
            temperature--;
        }
    }
}
