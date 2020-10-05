import java.util.Scanner;

public class Lex216{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double salario,emprestimo,parcela, porcent;

        System.out.println(" Digite seu salario ");
        salario=rl.nextDouble();  

        
        System.out.println(" Digite o valor do emprestimo");
        emprestimo=rl.nextDouble();  
            

        porcent= salario-((salario*30)/100);
        System.out.println("Pagamento - 30%  " +porcent);
       
        if(salario<0){
            System.out.println("Digte um valor correto");            
        }else if(porcent<emprestimo){
            System.out.println("Ultrapassou o valor limite  --> ");
        }else if(emprestimo<porcent){
            System.out.println("Quantas parcelas vai querer pagar");   
            parcela=rl.nextDouble();      
        }
    
        
    }
}