public class Ride {
    private Location startLocation;
    private Location endLocation;
    private boolean isCompleted;


    public Ride(Location startLocation, Location endLocation) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.isCompleted = false;
    }


    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        this.isCompleted = completed;
    }


    public String toString() {
        return "Ride from " + startLocation.name + " to " + endLocation.name;
    }
}



