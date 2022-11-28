import java.util.Scanner;

public class a_single_if_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        if(a>0){ //checks only a condition
            System.out.println("The number is positive");
        }
        sc.close();
    }
}
