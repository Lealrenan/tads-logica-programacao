import java.util.Scanner;

public class Lex05{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float far,cel,fahr,conv;

        System.out.println("Digite o valor fahrenheit:");
        far=renan.nextFloat();
        System.out.println("Digite o valor celsius:");
        cel=renan.nextFloat();

        
        conv= (cel-(far-32))/45;

        System.out.println("A conversao :" +conv);

    }
}