public class c_object {
    public static void main(String[] args) {
        Object obj = new String("Sanothimi");
        Class c = obj.getClass();
        System.out.println("Classname of object obj is = "+c.getName());
    }
}
