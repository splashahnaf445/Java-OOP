public class RideSharingService {
    private Ride[] rides = new Ride[10];


    public Ride requestRide(User user, Location startLocation, Location endLocation) {
        Ride newRide = new Ride(startLocation, endLocation);

        for (int i = 0; i < rides.length; i++) {
            if (rides[i] == null) {
                rides[i] = newRide;
                break;
            }
        }

        System.out.println("Ride Requested:");
        System.out.println("From: " + startLocation.name + ", To: " + endLocation.name);

        return newRide;
    }

    public void acceptRide(Driver driver, Ride ride) {
        if (!driver.isAvailable) {
            System.out.println("Driver is unavailable to accept the ride.");
            return;
        }
        driver.isAvailable = false;

        System.out.println("Ride Accepted by Driver: " + driver.name);
    }

    public void completeRide(Driver driver, Ride ride) {
        if (ride.isCompleted) {
            System.out.println("Ride is already completed.");
            return;
        }

        ride.isCompleted = true;

        driver.isAvailable = true;
        System.out.println("Ride completed.");
    }
}


