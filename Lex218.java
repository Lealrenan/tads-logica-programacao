import java.util.Scanner;

public class Lex218{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float carros,vtotal, salario, comissao, comissao2, receber;

        System.out.println(" Quantos carros foram vendidos no mes ?  ");
        carros=rl.nextFloat();  
        System.out.println(" Valor total dos carros vendidos  ");
        vtotal=rl.nextFloat();      
        System.out.println(" Valor do seu sala'rio Fixo  ");
        salario=rl.nextFloat();         


        comissao= ((carros*3)/100);
        comissao2= (vtotal*5)/100;


        receber=salario+vtotal+comissao+comissao2;

        System.out.println("Total a receber: "+receber);             
                

        
    }
}