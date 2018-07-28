package lesson10.order;

import java.util.Date;

public class ElectronicsOrder extends Order {
    public ElectronicsOrder() {
    }

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    private int guaranteeMonths;

    public int getGuaranteeMonths() {
        return guaranteeMonths;
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
       Double delivery = 1.0 * this.getBasePrice();


        if (this.getShipToCity()!=null&&this.getShipToCity().equals("Киев") || this.getShipToCity().equals("Одесса"))
            delivery *= 0.1;
        else delivery *= 0.15;

      //  if (this.getBasePrice() > 1000) price *= 0.95;
       if (price > 1000) price *= 0.95;

        this.setTotalPrice(price+delivery);
    }
}
