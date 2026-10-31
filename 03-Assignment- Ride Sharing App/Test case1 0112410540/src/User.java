public class User {
    public String name;
    public int id;


    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void registerUser(User user) {
        System.out.println("User Registered:");
        System.out.println("Name: " + user.name);
        System.out.println("ID: " + user.id);
    }
}

