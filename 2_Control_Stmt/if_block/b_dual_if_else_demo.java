import java.util.Scanner;

public class b_dual_if_else_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        //checking dual contidion
        if(a>0){ 
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is not positive");
        }
        sc.close();
    }
}
