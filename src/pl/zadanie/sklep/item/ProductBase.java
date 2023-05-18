package pl.zadanie.sklep.item;

import pl.zadanie.sklep.gui.GUI;
import pl.zadanie.sklep.item.product.AGD;
import pl.zadanie.sklep.item.product.RTV;
import pl.zadanie.sklep.users.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductBase {

    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    GUI gui = new GUI();

    public ProductBase(){
        products.add(new RTV("TV", 10, 2000, true));
        products.add(new RTV("HI-FI", 5, 500, true));
        products.add(new AGD("Washermahine", 5, 1500, true));
        products.add(new AGD("Drayer", 5, 1500, true));
        products.add(new RTV("Iron", 15, 400, false));
    }

    public void addNewRTVorAGD(){
        System.out.println("Chcesz dodać RTV czy AGD?");
        String choice = scanner.nextLine();
        if(choice.equals("RTV"))
        products.add(new RTV(gui.addName(), gui.addNumerOfItem(), gui.addCost(), gui.internetAcces()));
        else{
            products.add(new AGD(gui.addName(), gui.addNumerOfItem(), gui.addCost(), gui.isBig()));
        }
    }

    public void buySth(){
        System.out.println("Podaj nazwę produktu: ");
        String name = scanner.nextLine();
        System.out.println("Podaj liczbę produktów: ");
        int liczba = scanner.nextInt();
        for(Product item : products)
            if(item.getName().equals(name) && item.getNumber()>=liczba){
                item.setNumber(item.getNumber()-liczba);
               System.out.println("Masz do zapłaty " + liczba*item.getCost());
                //ustawiłem by zmniejszył liczbę produktów o wartość kupionych produktów
            }
        else System.out.println("Nie udało się kupić produktu");
    }


    public List<Product> getProducts() {
        return products;
    }
}
