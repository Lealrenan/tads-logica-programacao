import java.util.Scanner;

public class Lex225{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double produto,real, cinquenta, vinte,dez,cinco;

        System.out.println(" Digite o valor do produto que deseja comprar  ");
        produto=rl.nextDouble();  
        System.out.println(" Vamos quebrar o cofrinho para ver quantas moedas temos para comprar o produto ");
        System.out.println(" moedas de 1 Real ");
        real=rl.nextDouble();
        System.out.println(" moedas de 50 centavos  ");
        cinquenta=rl.nextDouble();
        System.out.println("moedas de 25 centavos");
        vinte=rl.nextDouble();
        System.out.println(" moedas de 10 centavos  ");
        dez=rl.nextDouble();
        System.out.println(" moedas de 05 centavos  ");
        cinco=rl.nextDouble();

        

        real=real*1.00;
        cinquenta=cinquenta*0.50;
        vinte=vinte*0.25;
        dez=dez*0.10;
        cinco=cinco*0.05;

        double soma= real+cinquenta+vinte+dez+cinco;
        System.out.println(soma);

        if(soma>=produto){
            System.out.println("tem dinheiro para comprar");
        }else{
            System.out.println("junte mais um pouco ");
        }


        
    }
}