import java.util.Scanner;



public class Lex11{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);
        
        double a,b,c,x1,x2;              

        System.out.println("Digite o Valor de a");
        a=renan.nextFloat();
        System.out.println("Digite o valor de b");
        b=renan.nextFloat();
        System.out.println("digite o valor de c:");
        c=renan.nextFloat();
        
        double delta=((b*b)-(4*a*c));
        double raiz=Math.sqrt(delta);
        x1=(-b+raiz)/(2*a);
        x2=(-b-raiz)/(2*a);


        System.out.println("delta "+delta);
        System.out.println("raiz "+raiz);
        System.out.println("x' "+x1);
        System.out.println("x'' "+x2);
        

    }
}