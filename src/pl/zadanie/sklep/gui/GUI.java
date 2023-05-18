package pl.zadanie.sklep.gui;

import pl.zadanie.sklep.item.Product;
import pl.zadanie.sklep.item.product.AGD;
import pl.zadanie.sklep.item.product.RTV;

import java.util.List;
import java.util.Scanner;

public class GUI {

    Scanner scanner = new Scanner(System.in);

    public String showMenu() {
        System.out.println("1. Zarejestruj");
        System.out.println("2. Zaloguj");
        System.out.println("3. Wyjdź");
        return scanner.nextLine();
    }

    public String showMenu2() {
        System.out.println("1. Wyświetl listę zakupów");
        System.out.println("2. Kup");
        System.out.println("3. Dodaj produkt");
        System.out.println("4. Wyjdź");
        return scanner.nextLine();
    }

    public String showMenu3() {
        System.out.println("1. Wyświetl listę zakupów");
        System.out.println("2. Kup");
        System.out.println("3. Dodaj produkt");
        System.out.println("4. Uzupełnij produkt");
        System.out.println("5. Wyjdź");
        return scanner.nextLine();
    }

    public String addName() {
        System.out.println("Podaj nazwę przedmiotu");
        return scanner.nextLine();
    }

    public int addNumerOfItem() {
        System.out.println("Podaj liczbę przedmiotu");
        return scanner.nextInt();
    }

    public int addCost() {
        System.out.println("Podaj cene przedmiotu");
        return scanner.nextInt();
    }

    public boolean internetAcces() {
        System.out.println("Czy posiada dostęp do internetu, tak/nie");
        String have = scanner.next();
        if (have.equals("tak")) {
            return true;
        }
        return false;
    }

    public boolean isBig() {
        System.out.println("Czy jest to produkt ponadgabarytowy, tak/nie");
        String isBig = scanner.next();
        if (isBig.equals("tak")) {
            return true;
        }
        return false;
    }

//    public void showLogin(List<Users> users){
//        for(Users users1 : users){
//            System.out.println(users1.getLogin());
//        }
//    }


    public void ListItems(List<Product> productList) {
        for (Product product : productList) {
            if (product.getClass().getName().equals(RTV.class.getName())) {
                RTV rtv = (RTV) product;   //rzutowanie, przypisanie obiektu rtv do product
                System.out.println(new StringBuilder()
                        .append("Nazwa produktu: ")
                        .append(product.getName())
                        .append(" Liczba sztuk: ")
                        .append(product.getNumber())
                        .append(" Cena jednostkowa: ")
                        .append(product.getCost())
                        .append(" Czy ma dostęp do Wifi: ")
                        .append(rtv.ishasWiFIacces()));
            } else {
                AGD agd = (AGD) product; //rzutowanie, przypisanie obiektu agd do product
                System.out.println(new StringBuilder()
                        .append("Nazwa produktu: ")
                        .append(product.getName())
                        .append(" Liczba sztuk: ")
                        .append(product.getNumber())
                        .append(" Cena jednostkowa: ")
                        .append(product.getCost())
                        .append(" Czy produkt jest wielkogabarytowy: ")
                        .append(agd.isBig()));
            }
        }
    }

    public String addLogin() {
        System.out.println("Podaj login który chcesz zarejestrować");
        return scanner.next();
    }

    public String addPassword() {
        System.out.println("Podaj hasło które wprowadzić");
        return scanner.next();
    }

    public String Login() {
        System.out.println("Podaj login: ");
        return scanner.next();
    }

    public String Password() {
        System.out.println("Podaj hasło: ");
        return scanner.next();
    }


}






