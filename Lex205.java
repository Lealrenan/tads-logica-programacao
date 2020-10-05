import java.util.Scanner;

public class Lex205{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float valor1,valor2, div;

        System.out.print(" Digite o primeiro valor ");
        valor1=rl.nextFloat();
        System.out.print(" Digite o segundo valor ");
        valor2=rl.nextFloat();

        div=valor1/valor2;
        

        if(valor2!=0){
            System.out.println("Resultado da divisao "+div);
        } else{
            System.out.println("erro ");
        }
       

        
    }
}