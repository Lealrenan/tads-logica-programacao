import java.util.Scanner;

public class Lex212{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double maca,valor;

        System.out.println(" Quantas macas senhor(a) deseja : ");
        maca=rl.nextDouble();  
    
        
        if(maca>=12){
           
            valor=maca*1.30;
          
             System.out.println("Valor total das maças "+valor);

        }else if(maca<12){
          
            valor=maca*1.50;
          
             System.out.println("Valor total das maças "+valor);
        }

        

        
    }
}