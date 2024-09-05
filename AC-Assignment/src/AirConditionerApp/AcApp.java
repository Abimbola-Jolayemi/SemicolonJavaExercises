package AirConditionerApp;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AcApp {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        System.out.println("ABIMBS TECHNOLOGIES!!!");
        while(true) {
            int currentTemperature = ac.getTemperature();
            try {
                displayOptions();
                String option = input.nextLine();

                switch (option) {
                    case "1":
                        if (ac.turnOn()) {
                            System.out.print("The AC is already on!!!");
                            continue;
                        } else {
                            ac.turnOn();
                            System.out.println("Abimbs Technologies AC is now On");
                            System.out.print("The temperature is " + ac.getTemperature() + "°C");
                        }
                        break;

                    case "0":
                        ac.turnOff();
                        System.out.println("Abimbs Technologies AC is Off");
                        break;

                    case ">":
                            ac.increaseTemperature();
                            System.out.println("Current temperature is " + ac.getTemperature() + "°C");
                            currentTemperature = ac.getTemperature();
                            break;

                    case "<":
                        ac.decreaseTemperature();
                        System.out.println("Current temperature: " + ac.getTemperature() + "°C");
                        currentTemperature = ac.getTemperature();
                        break;

                    default: System.out.println("Invalid option!!!");
                }
                if (option.equals("0")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!!!");
                input.nextLine();
            }
            System.out.println("Current Temperature: " + currentTemperature);
        }
    }

    public static void displayOptions(){
        System.out.println();
        System.out.println("======================");
        System.out.print("""
                0. Off
                1. On
                >. Increase temperature
                <. Decrease temperature
                """);
        System.out.println("======================");
    }
}
