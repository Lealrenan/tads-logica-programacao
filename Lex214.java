import java.util.Scanner;

public class Lex214{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        int data,nascimento,voto;

        System.out.println(" Digite o Ano que estamos :  ");
        data =rl.nextInt();  
        System.out.println(" Seu ano de nascimento  ");
        nascimento=rl.nextInt();          

        voto=data-nascimento;
       
        
        if(voto>=16){
    
             System.out.println("Pode votar ");

        }else {

             System.out.println("Nao pode votar");

        }

        

        
    }
}