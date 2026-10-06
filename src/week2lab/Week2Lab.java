package week2lab;

public class Week2Lab {

    public static void main(String[] args) {
        
        Car car1 = new Car("Mercedes", "06N1090", 0, 30, 60);
        
        car1.drive(65);
        car1.checkStatus();
        car1.refuel(45);
        car1.checkStatus();
        car1.drive(550);
        car1.checkStatus();
        car1.refuel(15);

    }

}
