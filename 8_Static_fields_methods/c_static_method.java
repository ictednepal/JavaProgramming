public class c_static_method {
    static int roll = 45;
    static String name = "Ram";

    static void staticmethod(){
        System.out.println("Roll number = " + roll);
        System.out.println("Name is = " + name);
    }

    void nonstaticmethod()
    {
        staticmethod();
    }
    public static void main(String[] args) {
        c_static_method c1 = new c_static_method();
        c1.nonstaticmethod();
        System.out.println();
        staticmethod();
    }
}
