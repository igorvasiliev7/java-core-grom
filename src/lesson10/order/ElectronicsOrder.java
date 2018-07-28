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
@Override
   public void calculatePrice() {

       double delivery = this.getShipToCity()!=null&&this.getShipToCity().equals("Киев") || this.getShipToCity().equals("Одесса")?
           0.1*this.getBasePrice():this.getBasePrice()*0.15;


       double bonus =  this.getBasePrice() > 1000? this.getBasePrice()* 0.05:0;





        this.setTotalPrice(getBasePrice()+delivery-bonus);
    }
}
