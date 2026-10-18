public class PizzaShop {
    private int pizza_price=320;
    private int drink_price=40;
    private int fries_price=100;
    PizzaShop(){
// Write necessary codes here
        System.out.println("Welcome to Pizza Shop");

    }
    public void order(int x){
        int bill=(x*pizza_price);
        System.out.println("You ordered"+x+" Pizzas");
        System.out.println("Total Bill:"+bill+"Taka");
    }
    public void order(int x,int y){
        int bill=(x*pizza_price)+(y*drink_price);
        System.out.println("You ordered"+x+" Pizzas"+y+" Drinks");
        System.out.println("Total Bill:"+bill+"Taka");
    }

    public void order(int x,int y,int z){
        int bill=(x*pizza_price)+(y*drink_price)+(z*fries_price);
        System.out.println("You ordered"+x+" Pizzas"+y+" Drinks"+z+" Fries");
        System.out.println("Total Bill:"+bill+"Taka");
    }
}
