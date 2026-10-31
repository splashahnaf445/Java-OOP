public class Driver {
    String name;
    int id;
    String vehicleType;
    boolean isAvailable;

    public Driver(String name, int id, String vehicleType, boolean isAvailable) {
        this.name = name;
        this.id = id;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
    }


    public static void registerDriver(Driver driver) {
        System.out.println("Driver registered:");
        System.out.println("Name: " + driver.name + ", ID: " + driver.id);
    }
}

