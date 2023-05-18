package pl.zadanie.authenticator;

import pl.zadanie.sklep.gui.GUI;
import pl.zadanie.sklep.users.Users;

import java.util.List;

public class Authenticator {

    GUI gui = new GUI();
    Users users = new Users();

    public boolean authenticator(List<Users> users) {
        int counter = 0;
        while (counter < 3) {
            for (Users user : users) {
                if (gui.Login().equals(user.getLogin()) && gui.Password().equals(user.getPassword())) {
                    return true;
                }
            }
            System.out.println("Incorrect login or password");
            counter++;
        }
        return false;
    }

//    public boolean checkLogin(List<Users> user) {
//        if (this.users.getLogin().equals("admin")) {
//            return true;
//        }
//        return false;
//    }

    public void check(boolean result) {
        if (result) {
            System.out.println("Wprowadziłeś poprawny login i hasło");
        } else {
            System.out.println("Wprowadziłeś zły login lub hasło");
        }
    }

}
