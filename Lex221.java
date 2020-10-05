import java.util.Scanner;

public class Lex208{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        
        double comp,volta,gasol,consumo;

        System.out.println(" Digite o comprimento da Pista: ");
        comp=rl.nextDouble(); 
        System.out.println(" Total de voltas a ser percorridas ");
        volta=rl.nextDouble();
        System.out.println(" quantos reabastecimentos ");
        gasol=rl.nextDouble();
        System.out.println(" Consumo do carro ");
        consumo=rl.nextDouble();

        double abast=gasol/volta;
        double dist=abast/comp;
        double litros=dist/consumo;

        System.out.println(" numero mínimo até o primeiro abastecimento é "+litros+" L");
       

        
    }
}