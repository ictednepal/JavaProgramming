import java.util.Scanner;

public class h_areaofsquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        int area = l * l;
        System.out.println("The area = "+area);
        sc.close();
    }
}