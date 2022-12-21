public class b_static_method {
    // static varible
    static int x = 34;

    // instance variable
    int y = 56;

    // instance method
    void displayNone() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    // static method
    static void displayStatic() {
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        b_static_method b1 = new b_static_method();
        b1.displayNone();
        displayStatic();
    }
}
