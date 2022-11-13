import java.util.Scanner;
import java.lang.Math;

public class j_volumeofcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        int volume = (int)(Math.pow(l, 3));
        System.out.println("The volume =" + volume);
        sc.close();
    }
}
