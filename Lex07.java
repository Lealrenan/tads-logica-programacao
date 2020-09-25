import java.util.Scanner;

public class Lex07{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float km,velo,temp;

        System.out.println("Digite o Km de distancia :");
        km=renan.nextFloat();
        System.out.println("Digite a velocidade :");
        velo=renan.nextFloat();

        
        temp=km/velo;

        System.out.println("seu tempo de percurso sera de :" +temp+"horas");

    }
}