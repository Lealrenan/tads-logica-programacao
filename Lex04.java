import java.util.Scanner;

public class Lex04{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float b,h,t;

        System.out.println("Digite o valor da base do triangulo:");
        b=renan.nextFloat();
        System.out.println("Digite o valor da altura do triangulo:");
        h=renan.nextFloat();

        t=(b*h)/2;

        System.out.println("A area do triangulo e :" +t);


    }
}