public class Notebook {
    private String brand;
    private String model;
    private int ramSize;
    private int storageSize;
    private String operatingSystem;
    private String color;
    private double price;

    public Notebook(String brand, String model, int ramSize, int storageSize, String operatingSystem, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + operatingSystem + ", " + ramSize + "GB RAM, " + storageSize + "GB SSD, " + color + ", " + price + " руб." + ")";
    }
}