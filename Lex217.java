import java.util.Scanner;

public class Lex217{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float fabrica,imposto,custo,distribuidor;

        System.out.println(" Informe o Custo de Fabrica  ");
        fabrica=rl.nextFloat();  
                

        distribuidor=(fabrica*28)/100;
        imposto=(fabrica*45)/100;
        custo = fabrica+distribuidor+imposto;

        System.out.println("Valor com impostos"+custo);
                

        
    }
}