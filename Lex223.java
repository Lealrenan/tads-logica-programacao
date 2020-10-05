import java.util.Scanner;

public class Lex223{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        int atual, maxima, minima,media;

        System.out.println(" Digite a quantidade atual de RJ45 no estoque  ");
        atual=rl.nextInt();  
        System.out.println(" Digite a quantidade maxima no estoque");
        maxima=rl.nextInt();
        System.out.println(" Digite a quantidade minima no estoque ");
        minima=rl.nextInt();

        media= (maxima+minima)/2;    
        
        System.out.println(media);
        

       if(atual>=media){
           System.out.println("Nao efetuar a compra");
       }else{
           System.out.println("Efetuar compra");
       }
                

        
    }
}