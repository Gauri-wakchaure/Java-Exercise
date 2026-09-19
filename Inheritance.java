class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.color);
        c1.vehicle_Details();        
    }                   
 }

class Vehicle {
    String name = "BMW";
}
class Car extends Vehicle {
    String color = "Black";

    public void vehicle_Details(){
    this.name = name;
    this.color = color;
}
}