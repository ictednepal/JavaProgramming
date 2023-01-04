class GrandFather {
    public void grand() {
        System.out.println("I am grandfather.");
    }
}

class Father {
    public void dad() {
        System.out.println("I am dad.");
    }
}

// will be solved in interface
/*
 * class Child extends Father, GrandFather {
 * public void baby() {
 * System.out.println("I am baby.");
 * }
 * }
 */

public class g_try_multiple {
    public static void main(String[] args) {
        /* Child c1 = new Child();
        c1.baby();
        c1.dad();
        c1.grand(); */
    }
}
