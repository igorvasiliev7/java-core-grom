package lesson10.order;

import java.util.Date;

public class FurnitureOrder extends Order {
    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity,
                          String shipToCity, int basePrice, Customer customerOwned) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
    }

    private String furnitureCode;

    void validateOrder() {
        if ((this.getShipFromCity().equals("Киев") || this.getShipFromCity().equals("Львов"))
                && (this.getBasePrice() >= 500 && !this.getCustomerOwned().getName().equals("Тест")) &&
                (this.getCustomerOwned().getGender().equals("Женский"))) this.setDateConfirmed(new Date());

    }

    void calculatePrice() {
        Double price = 1.0 * this.getBasePrice();

        if (this.getBasePrice() < 5000) price *= 1.05;
        else price *= 1.02;
        this.setTotalPrice(price);
    }
}
