import java.util.Scanner;

public class Lex213{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float n1,n2, media;

        System.out.println(" Digite a nota 1 :  ");
        n1=rl.nextFloat();  
        System.out.println(" Digite a nota 2 :  ");
        n2=rl.nextFloat();          

        media = (n1+n2)/2;
       
        
        if(media>=6){
    
             System.out.println("Parabe'ns Aprovado "+ media);

        }else {

             System.out.println("REPROVADO  "+media);

        }

        

        
    }
}