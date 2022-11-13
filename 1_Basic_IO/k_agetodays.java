import java.util.Scanner;

public class k_agetodays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        int days = age * 365;
        System.out.println("Age conversion in days ="+days);
        sc.close();
    }
}
