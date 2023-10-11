import java.util.Scanner;

public class ESQ5{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sua Idade Em: ");
        System.out.print("Anos: ");
        int Y = input.nextInt();
        System.out.print("Meses: ");
        int M = input.nextInt();
        System.out.print("Dias: ");
        int D = input.nextInt();
        System.out.println("IDade Expressa em Dias: " + ((Y*365)+(M*31)+D));
        System.out.printf("Aqui o usuário tem %d anos, %d meses e %d dias de idade. Assim, sua idade expressa em dias é %d.", Y, M, D, ((Y*365)+(M*31)+D));
    }
}