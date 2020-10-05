import java.util.Scanner;

public class Lex203{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float valor;

        System.out.print(" Digite um valor: ");
        valor=rl.nextFloat();
        

        if(valor>=0){
            System.out.println("Positivo");
        } else{
            System.out.println("Negativo");
        }
       

        
    }
}