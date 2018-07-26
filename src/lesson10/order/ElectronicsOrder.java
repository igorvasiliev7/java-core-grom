package lesson10.order;

public class ElectronicsOrder extends Order {
    private int guarantyMonths;

    void validateOrder() {
        if ((this.getShipToCity().equals("Киев") || this.getShipToCity().equals("Харьков") ||
                this.getShipToCity().equals("Одесса") || this.getShipToCity().equals("Днепр")) &&
                (this.getShipFromCity().equals("Киев") || this.getShipFromCity().equals("Харьков") ||
                        this.getShipFromCity().equals("Одесса") ||
                        this.getShipFromCity().equals("Днепр")) && (this.getBasePrice() >= 100) &&
                (this.getCustomerOwned().getGender().equals("Женский")))

    }

    void calculatePrice() {

    }
}
