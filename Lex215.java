import java.util.Scanner;

public class Lex215{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float hinicio,hfinal,tpartida;

        System.out.println(" Hora do inicio da partida  ");
        hinicio=rl.nextFloat();  
        System.out.println(" hora do fim da partida ");
        hfinal=rl.nextFloat();            

        tpartida=hinicio-hfinal;
        
        if(tpartida>24){
            System.out.println("Ultrapassou o horario limite"+tpartida);
        }else{
            System.out.println("Partida dentro do tempo esperado "+tpartida);    
        }

        
    }
}