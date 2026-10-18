class FinalContext {
    public final void calculate() {
        System.out.println("calculate method is called");
    }
}


 class StaticContext extends FinalContext {
    final static int value; // You can't modify or remove this line of code
    private static double mark; // Mark made static to align with the main method
    private static int count;   // Count made static to allow direct access in the main method

    // Static initializer block to initialize static variables
    static {
        value = 8; // Initialize the final static variable
        mark = 90.0; // Initialize the static variable mark
        count = 1;   // Initialize the static variable count
    }

    // Static getCount() method to work with the static count variable
    public static int getCount() { // Changed access to public for the main method to access
        return ++count;
    }

    // Static getMark() method to work with the static mark variable
    public static double getMark() { // Changed access to public for the main method to access
        return mark;
    }

    // FinalContext's calculate method is final, so overriding is not allowed.
    // No need for an @Override or a new calculate method.

    // You can’t modify the following main method.
    public static void main(String... args) {
        count++; // Increment the static count variable
        System.out.println("count= " + getCount()); // Call the static getCount method
        System.out.println("value = " + value); // Access the static final value
        FinalContext sv = new StaticContext(); // Create a StaticContext object
        System.out.println("mark= " + ((StaticContext) sv).getMark()); // Access the static getMark method
        sv.calculate(); // Call the calculate method from FinalContext
    }
}
