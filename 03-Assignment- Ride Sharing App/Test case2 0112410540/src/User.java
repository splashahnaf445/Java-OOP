public class User {
    public String name;
    public int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public static void registerUser(User user) {
        System.out.println("User registered:");
        System.out.println("Name: " + user.name + ", ID: " + user.id);
    }
}

