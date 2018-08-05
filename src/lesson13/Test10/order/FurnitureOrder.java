package lesson13.Test10.order;

import java.util.Date;

public class FurnitureOrder extends Order {
    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }



    private String furnitureCode;

   public void validateOrder() {
        if ((this.getShipFromCity().equals("Киев") || this.getShipFromCity().equals("Львов"))
                && (this.getBasePrice() >= 500 && !this.getCustomerOwned().getName().equals("Тест")) &&
                (this.getCustomerOwned().getGender().equals("Женский"))) this.setDateConfirmed(new Date());

    }

    public void calculatePrice() {
        Double price = 1.0 * this.getBasePrice();

        if (price < 5000) price *= 1.05;
        else price *= 1.02;
        this.setTotalPrice(price);
    }
}
