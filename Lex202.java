import java.util.Scanner;

public class Lex202{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float base, altura, area;

        System.out.print(" Digite o valor da Base : ");
        base=rl.nextFloat();
        System.out.print(" Digite o valor da Altura : ");
        altura=rl.nextFloat();

        area=base*altura;
        System.out.println("area do retangulo e : "+area);
       

        
    }
}