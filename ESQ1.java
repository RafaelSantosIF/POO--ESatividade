import java.util.Scanner;

public class ESQ1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Número: ");
        int indice = input.nextInt();

        for(int m = 1; m <= 10; m++){
            System.out.printf("%d x %d = %d\n", indice, m, (indice*m));
        }
    }
}