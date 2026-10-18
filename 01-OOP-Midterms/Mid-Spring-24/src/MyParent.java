public class MyParent {
    private int p;
    public final int myfunction(){
        return p*p;
    }
    public MyParent(int p){
        this.p = p;

    }
    public MyParent(){}
    public double myroot(){
            return Math.sqrt(p);
    }

    public void set_p(int Q){p = Q;}
// Write your code here

}


 class Mychild extends MyParent{

    public Mychild(){

    }

    public Mychild(int K){
     super(K);
    }


// write your code of myroot() that finds the square
// root of p in class Myparent
// write other necessary codes here
}
