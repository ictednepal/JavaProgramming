import java.util.Scanner;

public class p_areaoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        int b = sc.nextInt();
        System.out.println("Enter height:");
        int h = sc.nextInt();
        float area = (float)0.5*b*h;
        System.out.println("The area of triangle = "+area);
        sc.close();
    }
}
