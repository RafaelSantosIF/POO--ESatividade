import java.util.Scanner;

public class ESQ2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Graus Celsius: ");
        double C = input.nextDouble();
        double F = (9*C+160)/5;
        System.out.printf("Graus Farenheit: %.2f", F);
    }
}