import java.util.Scanner;

public class i_volumeof_cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        System.out.println("Enter height:");
        int h = sc.nextInt();
        int volume = l * b * h;
        System.out.println("The volume =" + volume);
        sc.close();
    }
}
