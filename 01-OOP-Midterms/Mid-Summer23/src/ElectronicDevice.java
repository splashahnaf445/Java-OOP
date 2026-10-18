public class ElectronicDevice {
        String brand;
        double price;
        public ElectronicDevice(String brand, double price) {
            this.brand = brand;
            this.price = price;
        }
        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Price: $" + price);
        }
}

class Smartphone extends ElectronicDevice {
    String model;
    String OS;
    private String IMEI;

    Smartphone(String brand, double price, String model, String OS, String IMEI) {
        super(brand, price);
        this.model = model;
        this.OS = OS;
        this.IMEI = IMEI;
    }

    void displayinfo() {
        super.displayInfo();
        System.out.println("Model: " + model + " Operating System: " + OS);
    }


// A getter method allows controlled access to private fields outside the class while maintaining encapsulation.

    public String getIMEI() {
        return IMEI;
    }

}