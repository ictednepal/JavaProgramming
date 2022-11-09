import java.util.Scanner;

public class e_areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = 0;
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        area = l*b;
        System.out.println("Area = "+area + " sq.m.");
        sc.close();
    }
}
