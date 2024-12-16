
public class Myobject {
    private double r;

    Myobject(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double findVolume(){
        return -1.0;
    }
}

class Sphere extends Myobject {
    Sphere(double r) {
        super(r);
    }
    public double findVolume(){
        double r=getR();
        return 1.33*Math.PI*Math.pow(r,3);
    }
}

class Cylinder extends Myobject {
    private double h;

    public double getH(){
        return h;
    }
    Cylinder(double r,double h) {
        super(r);
        this.h = h;
    }
    public double findVolume(){
        double r=getR();
        return Math.PI*Math.pow(r,2)*h;
    }
}

class Cone extends Cylinder {
    Cone(double r,double h) {
        super(r,h);
    }
    public double findVolume(){
        double r=getR();
        double h=getH();
        return 0.33*Math.PI*Math.pow(r,2)*h;
    }
}


