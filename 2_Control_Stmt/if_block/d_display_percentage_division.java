import java.util.Scanner;


public class d_display_percentage_division {
    public static void main(String[] args) {
        double nep,eng,sci,com,eco,t_om,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Nepali:");
        nep = sc.nextDouble();
        System.out.println("Enter marks in English:");
        eng = sc.nextDouble();
        System.out.println("Enter marks in Science:");
        sci = sc.nextDouble();
        System.out.println("Enter marks in Computer:");
        com = sc.nextDouble();
        System.out.println("Enter marks in Economics:");
        eco = sc.nextDouble();
        t_om = nep+eng+sci+com+eco;
        per = t_om/5.0;
        System.out.println("Total marks is = "+t_om);
        System.out.println("Total percentage is = "+per);
        if(per >=80){
            System.out.println("Distinction");
        }
        else if(per>=60){
            System.out.println("First");
        }
        else if(per>=45){
            System.out.println("Second");
        }
        else if(per>=32){
            System.out.println("Third");
        }
        else{
            System.out.println("FAILED");
        }
        sc.close();
    }
}
