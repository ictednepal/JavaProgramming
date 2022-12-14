public class c_single_dimentional_array_single_record_exception {
    public static void main(String[] args) {
        int marks[] = { 98, 78, 56, 34, 67 };
        System.out.println(marks[3]); //34
        System.out.println(marks[6]); //ArrayIndexOutOfBoundsException
    }
}
