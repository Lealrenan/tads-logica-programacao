import java.util.Scanner;

public class Lex222{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double saldo,debito,credito,saldoatual;

        System.out.println(" Digitel seu saldo  ");
        saldo=rl.nextDouble();  
        System.out.println(" Digite o seu valor de debito");
        debito=rl.nextDouble();
        System.out.println(" digite seu valor de credito  ");
        credito=rl.nextDouble();
      
        saldoatual=saldo-debito+credito;

       if(saldoatual>=0){
           System.out.println("Saldo Positivo");
       }else{
           System.out.println("Saldo Negativo");
       }
                

        
    }
}