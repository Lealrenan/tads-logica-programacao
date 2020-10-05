import java.util.Scanner;

public class Lex207{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        float htm,ht,desc,pagamento,calc;

        System.out.println(" Quanto você ganha por hora trabalhada ? ");
        ht=rl.nextFloat();
        System.out.println(" digite quantas horas vc trabalha no mes : ");
        htm=rl.nextFloat();
        System.out.println(" Tem mais algum desconto se tiver quantos % : ");
        desc=rl.nextFloat();


        
        pagamento=ht*htm;
        float pgtodescf=((pagamento*15)/100)-pagamento;   
        
        if(desc>0){
            pgtodescf=((pgtodescf*desc)/100)-pgtodescf;
            System.out.println("Seu salario com referentes descontos: "+pgtodescf);

        }else{

        System.out.println("salario mensal: "+pagamento);
        System.out.println("salario mensal  com desconto: "+pgtodescf);
        }


        

        
    }
}