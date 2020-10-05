import java.util.Scanner;

public class Lex209{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double raio,comp;
        double pi= 3.141692;

        System.out.println(" Digite o Raio da Circunferencia  ");
        raio=rl.nextDouble();  
               
        comp=2*pi*raio;


        System.out.println("comprimento da circunferencia e': "+comp);             
                

        
    }
}