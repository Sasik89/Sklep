package pl.zadanie.sklep.item.product;

import pl.zadanie.sklep.item.Product;

public class AGD extends Product {

    private boolean isBig;

    public AGD(String name, int number, int cost, boolean isBig) {
        super(name, number, cost);
        this.isBig = isBig;
    }

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }
}
