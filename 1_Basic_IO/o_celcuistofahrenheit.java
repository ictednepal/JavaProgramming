import java.util.Scanner;

public class o_celcuistofahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celcius:");
        double c = sc.nextDouble();
        double f = (9.0/5.0)*c +32;
        System.out.println("The fahrenheit conversion = "+f);
        sc.close();
    }
}
