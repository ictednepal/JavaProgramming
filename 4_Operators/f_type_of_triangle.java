import java.util.Scanner;

public class f_type_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a :");
        int a = sc.nextInt();
        System.out.println("Enter side b :");
        int b = sc.nextInt();
        System.out.println("Enter side c :");
        int c = sc.nextInt();

        if(a==b && a==c){
            System.out.println("Equilateral Triangle");
        }
        else if(a==b || a==c || b==c){
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle.");
        }
        sc.close();
    }
}
