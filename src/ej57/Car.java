package ej57;

public class Car {
    private String color;
    private String brand;
    private String model;
    private int hp;
    private int doors;
    private String plate;

    public Car(String color, String brand, String model, int hp, int doors, String plate) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.doors = doors;
        this.plate = plate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return plate + ": " +
                brand + " " +
                model + ", " +
                color + ", " +
                doors + " doors, " +
                hp + " HP";
    }
}
