package lesson13.Test10.order;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        new ElectronicsOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer(),12);
        new ElectronicsOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer(),24);
        new FurnitureOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer(),"Zizi");
        new FurnitureOrder("Kuku", new Date(), "Одесса", "Киев", 100, new Customer(),"Kiki") ;
    }
}