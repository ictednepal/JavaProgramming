import java.util.Scanner;

public class l_adddiffprodiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int add = a+b;
        int diff = a-b;
        int pro = a*b;
        int div = a/b;
        System.out.println("The sum is = "+add);
        System.out.println("The difference is = "+diff);
        System.out.println("The product is = "+pro);
        System.out.println("The quotient is = "+div);
        sc.close();
    }
}
