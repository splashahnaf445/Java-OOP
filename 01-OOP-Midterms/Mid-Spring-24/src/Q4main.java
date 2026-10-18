public class Q4main {
    public static void main(String[] args) {
        Fish fish=new Fish("small");
        Vegetable vegetable=new Vegetable("Cauliflower");
        fish.setparameter();
        vegetable.setparameter();

        System.out.println("Price of fish: "+fish.getprice(3)+"Taka");
        System.out.println("Price of vegetable: "+vegetable.getprice(2)+"Taka");
    }

}
