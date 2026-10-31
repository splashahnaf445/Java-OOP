public class Main {
    public static void main(String[] args) {
        // Create Locations
        Location loc1 = new Location("Downtown");
        Location loc2 = new Location("Airport");

        // Create User and Drivers
        User user2 = new User("Hossain", 2);
        Driver driver1 = new Driver("Sakib", 101, "Sedan", false); // Initially unavailable
        Driver driver2 = new Driver("Alisha", 102, "SUV", true); // Initially available

        // Register User and Drivers
        User.registerUser(user2);
        Driver.registerDriver(driver1);
        Driver.registerDriver(driver2);

        // Create RideSharingService
        RideSharingService service = new RideSharingService();

        // Request Ride
        Ride ride2 = service.requestRide(user2, loc1, loc2);

        // Try to accept Ride with an unavailable driver (Sakib)
        service.acceptRide(driver1, ride2);

        // Accept Ride with an available driver (Alisha)
        service.acceptRide(driver2, ride2);

        // Complete Ride
        service.completeRide(driver2, ride2);

        // Attempt to complete the same ride again (should show error)
        service.completeRide(driver2, ride2);
    }
}

