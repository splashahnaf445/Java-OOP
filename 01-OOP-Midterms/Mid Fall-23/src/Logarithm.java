
public class Logarithm{
    int b;
    double x;

    Logarithm(int b, double x){
        this.b = b;
        this.x = x;
    }
    Logarithm(){

    }

    /*Logarithm(Logarithm log1){
        this=log1;
    }*/

    public double myfunc(){
        return Math.log(x)/Math.log(b);
    }
}