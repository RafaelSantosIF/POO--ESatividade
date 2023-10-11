import java.util.Scanner;

public class ESQ3{
    public static void calc(double T, double VM){
        T = T*60;
        VM = VM/3.6;
        double DIS = (T*VM)/1000;
        double L = DIS/12;
        System.out.printf("Distância Percorrida: %.2f km \nLitros Usados: %.2f L\n", DIS, L);
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Tempo Gasto [Minutos]: ");
        double t = input.nextDouble();
        System.out.print("Velocidade Media [km/h]: ");
        double vm = input.nextDouble();
        
        calc(t, vm);
    }
}