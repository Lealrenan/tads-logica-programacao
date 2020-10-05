import java.util.Scanner;

public class Lex211{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        int n1,n2, adicao;

        System.out.println(" Digite o valor 1 :  ");
        n1=rl.nextInt();  
        System.out.println(" Digite o valor 2 :  ");
        n2=rl.nextInt();          

        adicao=n1+n2;
        
        
        if(adicao>20){
           
          adicao=n1+n2+8;
             System.out.println("resultado "+adicao);

        }else if(adicao<=20){
          adicao=(n1+n2)-10;

             System.out.println("resultado 2 : "+adicao);

        }

        

        
    }
}