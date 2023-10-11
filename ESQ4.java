import java.util.Scanner;

public class ESQ4{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Cotação do Dólar: ");
        double COT = input.nextDouble();
        System.out.print("Valor em Dólar: ");
        double USS = input.nextDouble();
        System.out.printf("Valor em Real: %.3f", COT*USS);
    }
}