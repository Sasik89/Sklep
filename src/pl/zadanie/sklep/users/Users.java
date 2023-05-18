package pl.zadanie.sklep.users;

import java.util.List;

public class Users {

    private String login;
    private String password;

    public Users(){}

//    public boolean checkLogin(List<Users> users) {
//        if (getLogin().equals("admin")) {
//            return true;
//        }
//        return false;
//    }


    public Users(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
