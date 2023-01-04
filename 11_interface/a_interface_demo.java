interface Teacher {
    void teach();
}

interface Student {
    void study();
}

class College {
    void manage() {
        System.out.println("It manages the students and the teachers.");
    }
}

public class a_interface_demo extends College implements Teacher, Student {
    public static void main(String[] args) {
        a_interface_demo obj = new a_interface_demo();
        obj.teach();
        obj.study();
        obj.manage();
    }

    @Override
    public void teach() {
        System.out.println("I am teaching.....");

    }

    @Override
    public void study() {
        System.out.println("I am studying......");
    }
}
