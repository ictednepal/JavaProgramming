class SuperClass {
    public void hi() {
        System.out.println("Hi from Super Class.");
    }
}

class SubClass extends SuperClass {
    public void hi() {
        System.out.println("Hi from Sub Class.");
    }
}

public class d_single_same_method {
    public static void main(String[] args) {
        SuperClass a = new SuperClass();
        SuperClass b = new SubClass();
        a.hi();
        b.hi();
    }
}
