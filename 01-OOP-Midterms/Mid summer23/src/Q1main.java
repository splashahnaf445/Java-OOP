

public class Q1main {
    public static void main(String[] args) {
        Vehicle defaultVehicle = new Vehicle();
        defaultVehicle.honk();
        defaultVehicle.info();
        Vehicle truck = new Vehicle("Ford", "F- 150");
                truck.honk("Loud horn sound");
                truck.info();

    }
}
