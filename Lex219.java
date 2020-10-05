import java.util.Scanner;

public class Lex219{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double comp,alt,larg,azulejos;

        System.out.println(" Digite o comprimento da cozinha  ");
        comp=rl.nextFloat();  
        System.out.println(" Digite a largura da cozinha  ");
        larg=rl.nextFloat();
        System.out.println(" Digite a altura da cozinha  ");
        alt=rl.nextFloat();

        double area=comp*larg*alt;

        azulejos=area*1.5;
                

        System.out.println("Metragem cozinha "+area);
        System.out.println("Quantidade em metros de azulejo "+azulejos);
                

        
    }
}