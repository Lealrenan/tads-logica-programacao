import java.util.Scanner;

public class Lex210{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        int idade;

        System.out.println(" Qual Sua Idade?  ");
        idade=rl.nextInt();
       

        
        
        
        if(idade>=18){
           
             System.out.println("Adulto ");

        }else if(idade >=14 && idade<18){

             System.out.println("Juvenil ");

        }else if(idade>=9 && idade <14){
             System.out.println("Infantil ");

        }else if(idade <9){
             System.out.println("mirim ");
        }      

        
    }
}