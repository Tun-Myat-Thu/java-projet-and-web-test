import java.util.ArrayList;

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", name: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class UserList {
    public static void main(String[] args) {
        User user1 = new User(10, "John Doe");
        User user2 = new User(12, "Alice");
        User user3 = new User(15, "Bob");

        // arry
        User[] users = { user1, user2, user3 };
        // for each loop
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("================================================");

        ArrayList<User> userlist = new ArrayList<User>();

        userlist.add(user1);
        userlist.add(user2);
        userlist.add(user3);
        System.out.println(userlist);
    }
}
