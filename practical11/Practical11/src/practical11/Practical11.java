/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical11;

/**
 *
 * @author krushna
 */

// Base class
class Vehicle {
    private String brand;
    private int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public String toString() {
        return "Brand: " + brand + ", Year: " + year;
    }
}

// Derived class (Car)
class Car extends Vehicle {
    private int doors;
    
    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }
    
    public int getDoors() {
        return doors;
    }
    
    public void setDoors(int doors) {
        this.doors = doors;
    }
    
    public String toString() {
        return super.toString() +", Doors: " + doors;
    }
}

// Derived class (Motorcycle)
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    
    public boolean hasSidecar() {
        return hasSidecar;
    }
    
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    
    public String toString() {
        return super.toString() +", Has Sidecar: " + hasSidecar;
    }
}
class Truck extends Vehicle {
    private int loadCapacity;
    
    public Truck(String brand, int year, int loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }
    
    public int getLoadCapacity() {
        return loadCapacity;
    }
    
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    public String toString() {
        return super.toString() + ", Load Capacity: " + loadCapacity + " tons";
    }
}



public class Practical11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car car = new Car("Tata", 2022, 4);
        System.out.println(car);
        Motorcycle bike = new Motorcycle("Herculus", 2020, true);
        System.out.println(bike);
        Truck truck = new Truck("BMW", 2018, 10);
        System.out.println(truck);
    }
    
}
