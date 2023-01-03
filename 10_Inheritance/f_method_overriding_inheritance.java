class Teacher {
    public void study() {
        System.out.println("Teacher is studying.");
    }
}

class Student extends Teacher {
    @Override
    public void study() {
        System.out.println("Student is studying.");
    }
}

public class f_method_overriding_inheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();
    }
}
