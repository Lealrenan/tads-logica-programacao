import java.util.Scanner;

public class Lex204{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float valor1,valor2;

        System.out.print(" Digite o primeiro valor ");
        valor1=rl.nextFloat();
        System.out.print(" Digite o segundo valor ");
        valor2=rl.nextFloat();
        

        if(valor1>valor2){
            System.out.println("Valor 1 --> "+valor1);
        } else{
            System.out.println("valor 2 --> "+valor2);
        }
       

        
    }
}