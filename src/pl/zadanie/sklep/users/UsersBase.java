package pl.zadanie.sklep.users;
import pl.zadanie.sklep.gui.GUI;
import java.util.ArrayList;
import java.util.List;

public class UsersBase {

    List<Users> users = new ArrayList<>();
    GUI gui = new GUI();

    public UsersBase(){
        users.add(new Users("admin", "admin"));
        users.add(new Users("wiesiek", "wiesiek123"));
    }
    public void addLoginAndPassword(){
        users.add(new Users(gui.addLogin(), gui.addPassword()));
    }


    public List<Users> getUsers() {
        return users;
    }


    public void setUsers(List<Users> users) {
        this.users = users;
    }

}
