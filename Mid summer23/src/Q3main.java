public class Q3main {
    public static void main(String[] args) {
        Sphere sp=new Sphere(2.5);
        Cylinder cl=new Cylinder(1.5,6.5);
        Cone cn=new Cone(1.9,8.9);

        System.out.println("Sphere volume= "+ sp.findVolume());
        System.out.println("Cylinder volume= "+ cl.findVolume());
        System.out.println("Cone volume= "+ cn.findVolume());
    }
}
