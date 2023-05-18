package pl.zadanie.sklep.item.product;

import pl.zadanie.sklep.item.Product;

public class RTV extends Product {

    private boolean hasWiFIacces;

    public RTV(String name, int number, int cost, boolean hasWiFIacces) {
        super(name, number, cost);
        this.hasWiFIacces = hasWiFIacces;
    }

    public boolean ishasWiFIacces() {
        return hasWiFIacces;
    }

    public void sethasWiFIacces(boolean hasWiFIacces) {
        this.hasWiFIacces = hasWiFIacces;
    }
}
