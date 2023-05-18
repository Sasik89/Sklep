package pl.zadanie.sklep.core;

import pl.zadanie.authenticator.Authenticator;
import pl.zadanie.sklep.gui.GUI;
import pl.zadanie.sklep.item.ProductBase;
import pl.zadanie.sklep.users.Users;
import pl.zadanie.sklep.users.UsersBase;

import java.util.List;

public class Core {

    GUI gui = new GUI();
    ProductBase productBase = new ProductBase();
    Authenticator authenticator = new Authenticator();
    UsersBase userBase = new UsersBase();
    boolean runAll = true;
    boolean run = true;

    public void start() {

        do {
            switch (gui.showMenu()) {
                case "1":
                    userBase.addLoginAndPassword();
                    break;
                case "2":
                    List<Users> users = userBase.getUsers();
                    run = authenticator.authenticator(users);
//                    gui.showLogin(users);

//                    System.out.println(authenticator.checkLogin(users));
                    while (run) {
                        switch (gui.showMenu2()) {
                            case "1":
                                gui.ListItems(productBase.getProducts());
                                break;
                            case "2":
                                productBase.buySth();
                                break;
                            case "3":
                                productBase.addNewRTVorAGD();
                                break;
                            case "4":
                                run = false;
                                break;
                            default:
                                System.out.println("Podałeś zły numer");
                                break;
                        }
                    }
                    break;

                case "3":
                    runAll = false;
                    break;
                default:
                    System.out.println("Podałeś zły numer");

            }

        }
        while (runAll);
    }

}