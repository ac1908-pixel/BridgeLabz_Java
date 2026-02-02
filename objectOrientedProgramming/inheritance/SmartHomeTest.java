package objectOrientedProgramming.inheritance;

class Device {
    String deviceId;
    boolean status; // true = ON, false = OFF

    // Constructor
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    // Constructor
    Thermostat(String deviceId, boolean status, double temperatureSetting) {
        super(deviceId, status); // call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus()
    @Override
    void displayStatus() {
        super.displayStatus(); // display device info first
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(
                "THERMO-101",
                true,
                22.5
        );

        thermostat.displayStatus();
    }
}
