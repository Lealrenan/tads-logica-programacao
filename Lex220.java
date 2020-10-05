import java.util.Scanner;

public class Lex220{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        double gasol=4.59;
        double kmini,kmfinal,litros, lucro, valort, km;

        System.out.println(" Digite a km inicial  ");
        kmini=rl.nextDouble();  
        System.out.println(" Digite a km final ");
        kmfinal=rl.nextDouble();
        System.out.println(" Litros de combustivel gasto  ");
        litros=rl.nextDouble();
        System.out.println("Valor Recebido");
        valort=rl.nextDouble();

        km= kmfinal-kmini;
        double gasto=litros*gasol;
        lucro=valort-gasto;

        System.out.println(" km rodado "+km);
        System.out.println("Gasto combustivel "+gasto);
        System.out.println("Lucro diario"+lucro);
                

        
    }
}