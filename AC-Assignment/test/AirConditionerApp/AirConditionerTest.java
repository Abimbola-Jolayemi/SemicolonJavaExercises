package AirConditionerApp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AirConditionerTest {

    @Test
    public void testThatAirConditionerIsOn() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        assertEquals(true, airConditioner.turnOn());
    }

    @Test
    public void testThatAirConditionerIsOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOff();
        assertEquals(true, airConditioner.turnOn());
    }

    @Test
    public void testThatAirConditionerTemperatureIsIncreased() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(16);
        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionerTemperatureIsDecreased() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(23);
        airConditioner.decreaseTemperature();
        assertEquals(22, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerTemperatureIsNotIncreasedAbove30() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(30);
        airConditioner.increaseTemperature();
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testThatAirConditionerTemperatureIsNotDecreasedBelow16() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(16);
        airConditioner.decreaseTemperature();
        assertEquals(16, airConditioner.getTemperature());
    }
}
