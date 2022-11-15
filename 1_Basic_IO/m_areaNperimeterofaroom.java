import java.util.Scanner;

public class m_areaNperimeterofaroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of room:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of room:");
        int b = sc.nextInt();
        int area = l*b;
        int peri = 2*(l+b);
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+peri);
        sc.close();
    }
}
