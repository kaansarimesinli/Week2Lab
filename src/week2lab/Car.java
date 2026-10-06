
package week2lab;

public class Car {
    private String model;
    private String plateNumber;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

    public Car(String model, String plateNumber, double mileage, double fuelLevel, double tankCapacity) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
        System.out.println("Car creating...");
        System.out.println("---------------------------------");
        System.out.printf("Car: %s(%s)%n", model, plateNumber);
        System.out.printf("Current mileage: %.1f KM %n", mileage);
        System.out.printf("Fuel Level: %.1f / %.1f L %n", fuelLevel, tankCapacity);
        System.out.println("---------------------------------");
    }
    
    public void drive(double km) {
        if(fuelLevel - km * 0.1 < 0) {
            System.out.println("Not enough fuel for this trip!\n");
        }else {
            fuelLevel -= km * 0.1;
            mileage += km;
            System.out.printf("%.1f km driving... %n%n", km);
        }
    }
    
    public void refuel(double amount) {
        if(fuelLevel + amount > tankCapacity) {
            System.out.printf("%.1f liters of fuel added... %n", tankCapacity - fuelLevel);
            fuelLevel = tankCapacity;
            System.out.println("No more fuel can be taken on!\n");
        }else {
            System.out.printf("%.1f liters of fuel added... %n%n", amount);
            fuelLevel += amount;
        }
    }
    
    public void checkStatus() {
        System.out.printf("Current mileage: %.1f KM %n", mileage);
        System.out.printf("Fuel Level: %.1f / %.1f L %n%n", fuelLevel, tankCapacity);
        if(fuelLevel < tankCapacity * 0.1) {
            System.out.println("Low fuel warning!!!\n");
        }
    }

}
