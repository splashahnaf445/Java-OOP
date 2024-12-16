class Person {
    int id;
    String name;
    static int s = 10;

    {
        System.out.println("3");
    }

    public Person() {
        this.id = 1;
        this.name = "M";
        System.out.println("1");
        s++;

    }

    public Person(int id, String name) {
        this();
        this.id = id;
        this.name = name;
        System.out.println("2");
        s++;
    }

}
