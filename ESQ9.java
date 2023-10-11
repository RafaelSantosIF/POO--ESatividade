import java.util.*;

public class ESQ9{
        public static void reverse(String[] array){
            Collections.reverse(Arrays.asList(array));
            System.out.println("Invertido: ");
            System.out.println(Arrays.asList(array));
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(":");
        String T = input.next();
        String[] texto = T.split("");
        reverse(texto);
    }
}