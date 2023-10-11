import java.util.Scanner;

public class ESQ7{
    public static void contagem_notas(int saque){
        int ced100 = 0; int ced50 = 0; int ced20 = 0; int ced10 = 0; int ced5 = 0; int ced2 = 0; int ced1 = 0;
        while(saque != 0){
            if(saque >= 100){
                ced100++;
                saque -= 100;
            } else if(saque >= 50){
                ced50++;
                saque -= 50;
            } else if(saque >= 20){
                ced20++;
                saque -= 20;
            } else if(saque >= 10){
                ced10++;
                saque -= 10;
            } else if(saque >= 5){
                ced5++;
                saque -= 5;
            } else if(saque >= 2){
                ced2++;
                saque -= 2;
            } else {
                ced1++;
                saque--;
            }
        }

        System.out.printf("O Número de Cédulas retiradas são: \n%d Notas de 100; \n%d Notas de 50; \n%d Notas de 20; \n%d Notas de 10; \n%d Notas de 5; \n%d Notas de 2; \n%d Moedas de 1;", ced100, ced50, ced20, ced10, ced5, ced2, ced1);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("VALOR DO SAQUE: ");
        int saque = input.nextInt();
        contagem_notas(saque);
    }
}