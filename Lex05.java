import java.util.Scanner;

public class Lex05{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float far,cel,fahr,conv;

        System.out.println("Digite o valor fahrenheit:");
        far=renan.nextFloat();
        


        
        cel= ((far-32)*5)/9;

        System.out.println("A conversao :" +cel);

    }
}