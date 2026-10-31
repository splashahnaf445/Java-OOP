public class Main {
    public static void main(String[] args) {
        Location loc1 = new Location("Downtown");
        Location loc2 = new Location("Airport");

        User user1 = new User("Sahid", 1);
        Driver driver1 = new Driver("Sakib", 101, "Sedan", true); // Driver initially available

        User.registerUser(user1);
        Driver.registerDriver(driver1);


        RideSharingService service = new RideSharingService();

        Ride ride1 = service.requestRide(user1, loc1, loc2);

        service.acceptRide(driver1, ride1);

        service.completeRide(driver1, ride1);
    }
}