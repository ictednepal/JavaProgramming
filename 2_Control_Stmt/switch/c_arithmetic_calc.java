import java.util.Scanner;

public class c_arithmetic_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = sc.nextDouble();
        System.out.println("Enter second number:");
        double b = sc.nextDouble();
        System.out.println("Enter a symbol(+,-,*,/) to perform operation : ");
        char opr = sc.next().charAt(0);
        switch (opr) {
            case '+':
                System.out.println("Sum = "+(a+b));
                break;
            case '-':
                System.out.println("Difference = "+(a-b));
                break;
            case '*':
                System.out.println("Product = "+(a*b));
                break;
            case '/':
                System.out.println("Quotient = "+(a/b));
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}