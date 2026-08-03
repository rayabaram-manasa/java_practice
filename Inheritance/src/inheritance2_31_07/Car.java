package inheritance2_31_07;

public class Car extends Vehicle{
    String model;

    public void drive(){
        System.out.println("Car is driving");
    }

 public static void main(String[] args) {

    Car c = new Car();
    c.brand = "Toyota";
    c.model = "Camry";

    System.out.println("Brand: " + c.brand);
    System.out.println("Model: " + c.model);
    c.start();
    c.drive();
    
 }
    
}
