package lesson10.order;

import java.util.Date;

public class ElectronicsOrder extends Order {
    public ElectronicsOrder() {
    }

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guarantyMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guarantyMonths = guarantyMonths;
    }

    private int guarantyMonths;

    public int getGuarantyMonths() {
        return guarantyMonths;
    }

   public void validateOrder() {
        if ((this.getShipToCity().equals("Киев") || this.getShipToCity().equals("Харьков") ||
                this.getShipToCity().equals("Одесса") || this.getShipToCity().equals("Днепр")) &&
                (this.getShipFromCity().equals("Киев") || this.getShipFromCity().equals("Харьков") ||
                        this.getShipFromCity().equals("Одесса") ||
                        this.getShipFromCity().equals("Днепр")) && (this.getBasePrice() >= 100) &&
                (this.getCustomerOwned().getGender().equals("Женский"))) this.setDateConfirmed(new Date());

    }

   public void calculatePrice() {
        Double price = 1.0 * this.getBasePrice();
        if (this.getShipToCity().equals("Киев") || this.getShipToCity().equals("Одесса"))
            price *= 1.1;
        else price *= 1.15;

        if (this.getBasePrice() > 1000) price *= 0.95;

        this.setTotalPrice(price);
    }
}
