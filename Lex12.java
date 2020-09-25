import java.util.Scanner;

public class Lex12{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);
        
        float nota;             

        System.out.println("Digite sua Nota");
        nota=renan.nextFloat();
        
        
    if(nota>=7){
        System.out.println("Aprovado");
    }else{
        System.out.println("recuperacao");
    }

        

    }
}