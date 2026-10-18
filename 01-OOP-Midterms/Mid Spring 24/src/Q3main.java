public class Q3main {
    public static void main(String args[]){
        Person p = new Person(1, "N");
        Person p1 = new Person();
        System.out.println(p1.s);
        p.s = 11;
        System.out.println(Person.s);
    }
}
