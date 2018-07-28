package lesson10.order;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        new ElectronicsOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer());
        new ElectronicsOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer());
        new FurnitureOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer());
        new FurnitureOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer());
    }
}