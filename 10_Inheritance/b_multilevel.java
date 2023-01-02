class GrandFather {
    public void grand() {
        System.out.println("I am grandfather.");
    }
}

class Father extends GrandFather {
    public void dad() {
        System.out.println("I am dad.");
    }
}

class Child extends Father {
    public void baby() {
        System.out.println("I am baby.");
    }
}

public class b_multilevel {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.baby();
        c1.dad();
        c1.grand();
    }
}
