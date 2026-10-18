public class Ride {
    static final int SpeedLimit = 80;
}

class Bike extends Ride {
    public int initial_speed=20;
    public int acceleration=2;
    public double getHighestAccelerationTime() {
        return initial_speed+(acceleration*2);

    }
    public double calculateFine(int hour) {
        return 50+(hour*100);
    }
}
class car extends Ride {
    public int initial_speed=40;
    public int acceleration=10;
    public double getHighestAccelerationTime() {
        return initial_speed + (acceleration * 2);
    }
    public double calculateFine(int hour) {
        return 100+(hour*150);
    }


    }
class Microbus extends Ride {
    public int initial_speed=15;
    public int acceleration=5;
    public double getHighestAccelerationTime() {
        return initial_speed + (acceleration * 2);

    }
    public double calculateFine(int hour) {
        return 3000.0;
    }

    }
