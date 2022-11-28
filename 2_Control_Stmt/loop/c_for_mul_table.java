import java.util.Scanner;

public class c_for_mul_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its mul table :");
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a+" x "+i+" = "+(a*i));
        }
        sc.close();
    }
}
