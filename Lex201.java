import java.util.Scanner;

public class Lex201{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float metro, cm;

        System.out.print("Digite o valor em metro para conversao :");
        metro=rl.nextFloat();

        cm=metro*100;

        System.out.println("Sua conversao e "+cm+" cm");
       

        
    }
}