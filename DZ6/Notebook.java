// Задача 6. Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

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