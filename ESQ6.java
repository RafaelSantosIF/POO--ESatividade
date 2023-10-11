import java.util.Scanner;
import java.util.Arrays;

public class ESQ6{
    public static String[] Tempo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o Horário no formato 'Hr:Min:Seg'");
        String T = input.nextLine();
        String[] array = T.split(":");
        //System.out.println(Arrays.toString(array));
        return array;
    }
    public static int PSegundos(String[] Tempo){
        int hora = Integer.parseInt(Tempo[0]); 
        int minuto = Integer.parseInt(Tempo[1]); 
        int segundo = Integer.parseInt(Tempo[2]);

        return ((hora*3600) + (minuto*60) + segundo);
    }
    public static void main(String [] args){
        String[] tempo = Tempo();
        int segundos = PSegundos(tempo); 
        System.out.printf("O Evento tem duração de %d Segundos!", segundos);
    }
}