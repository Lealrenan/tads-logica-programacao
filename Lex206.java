import java.util.Scanner;

public class Lex206{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        int ano,meses,dias,calc;

        System.out.println(" Digite quantos anos vc tem: ");
        ano=rl.nextInt();
        System.out.println(" Digite quantos meses ja se passou do seu aniversario ");
        meses=rl.nextInt();
        System.out.println(" Digite quantos dias falta para completar mais um mes do seu aniversario ");
        dias=rl.nextInt();


        meses=meses*30;
        ano=ano*365;

        calc=meses+ano+dias;
        
        System.out.println("Seus dias vividos sao: "+calc+" dias");

        

        
    }
}