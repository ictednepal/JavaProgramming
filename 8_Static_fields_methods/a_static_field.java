class Student {
    int roll;
    String name;
    static String clz = "Sanothimi";

    void input(int r, String n) {
        roll = r;
        name = n;
    }

    void output() {
        System.out.println("The roll number is = " + roll);
        System.out.println("The name is = " + name);
        System.out.println("The college is = " + clz);
    }
}

public class a_static_field {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input(12, "Ram");
        Student s2 = new Student();
        s2.input(14, "Sita");
        Student s3 = new Student();
        s3.input(15, "Hari");
        Student s4 = new Student();
        s4.input(17, "Shyam");
        Student s5 = new Student();
        s5.input(67, "Laxman");

        // Student.clz = "Bhaktapur";

        s1.output();
        System.out.println();
        s2.output();
        System.out.println();
        s3.output();
        System.out.println();
        s4.output();
        System.out.println();
        s5.output();
    }
}