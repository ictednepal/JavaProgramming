class Student{
    int roll;
    int age;
    String name;

    void setdata(int r, int a, String n){
        roll = r;
        age = a;
        name = n;
    }
    void getdata(){
        System.out.println("Name = " +name);
        System.out.println("Roll = " +roll);
        System.out.println("Age = " +age);
    }
}

public class b_studentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setdata(12, 25, "Ram");
        s1.getdata();
        System.out.println();
        Student s2 = new Student();
        s2.setdata(11, 23, "Sita");
        s2.getdata();
    }
}
