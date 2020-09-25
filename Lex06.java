import java.util.Scanner;

public class Lex06{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float nota1,nota2,media;

        System.out.println("Digite a nota 1 :");
        nota1=renan.nextFloat();
        System.out.println("Digite a nota 2 :");
        nota2=renan.nextFloat();

        
        media=(nota1*nota2)/2;

        System.out.println("Sua media e:" +media);

    }
}