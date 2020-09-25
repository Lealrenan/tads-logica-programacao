import java.util.Scanner;

public class Lex02{
    public static void main (String [] args){
        Scanner renan = new Scanner(System.in);

        float v, p, r; //valor, porcentagem/resultado

        System.out.println("Digite um numero para verificar a porcentagem :");
        v= renan.nextFloat();

        p=(v*20)/100;
        r=p+v;

        System.out.println("Seu valor com 20% :"+r);


    }
}