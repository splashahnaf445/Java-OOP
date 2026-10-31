public class Driver {
    public String name;
    public int id;
    public String vehicleType;
    public boolean isAvailable;

    public Driver(String name, int id, String vehicleType, boolean isAvailable) {
        this.name = name;
        this.id = id;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
    }


    public static void registerDriver(Driver driver) {
        System.out.println("Driver Registered:");
        System.out.println("Name: " + driver.name);
        System.out.println("ID: " + driver.id);
    }
}

