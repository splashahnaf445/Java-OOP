public class FoodItem {
    public double c, z;
    public String t;
    public double getprice(double amount){
        return c*amount*(1+z/100);
    }
}

 class Vegetable extends FoodItem{
    public void setparameter(){
        if(t.equals("Spinach")){ c = 20; z = 15; }
        else if(t.equals("Cauliflower")){c = 25; z = 18;}
    }
    public Vegetable(String t){
        this.t = t;
    }
}
 class Fish extends FoodItem{
    public void setparameter(){
        if(t == "Carp"){ c = 20; z = 15; }
        else if(t == "medium"){c = 25; z = 20;}
        else if(t == "small"){c = 200; z = 25;}
    }
    public Fish(String t){
        this.t = t;
    }
}