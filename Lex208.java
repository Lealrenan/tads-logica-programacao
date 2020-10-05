import java.util.Scanner;

public class Lex208{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        
        int eleit,branco,nulo,validos, total1,total2,total3;

        System.out.println(" Numero de eleitores ");
        eleit=rl.nextInt(); 
        System.out.println(" Numero de votos em branco ");
        branco=rl.nextInt(); 
        System.out.println(" Numero de votos nulos ");
        nulo=rl.nextInt(); 
        System.out.println(" Numero de votos validos ");
        validos=rl.nextInt(); 

        total1=((branco*100)/eleit);
        total2=((nulo*100)/eleit);
        total3=((validos*100)/eleit);

        System.out.println(" Percentual de votos em Branco "+total1+" %");
        System.out.println(" Percentual de votos em nulo "+total2+" %");
        System.out.println(" Percentual de votos em validos "+total3+" %");

        
    }
}