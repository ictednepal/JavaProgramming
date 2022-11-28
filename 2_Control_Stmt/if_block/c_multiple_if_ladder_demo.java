import java.util.Scanner;

public class c_multiple_if_ladder_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        //checking dual contidion
        if(a>0){ 
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
        sc.close();
    }
}
