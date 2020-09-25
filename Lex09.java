import java.util.Scanner;

public class Lex09{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float convi,h,m,c;
        float th,tm,tc,t,total;
        
        System.out.println("Numero de convidados");
        convi=renan.nextFloat();
        System.out.println("homens");
        h=renan.nextFloat();
        System.out.println("mulher:");
        m=renan.nextFloat();
        System.out.println("crianças");
        c=renan.nextFloat();
        
        th=h*400;
        tm=m*320;
        tc=c*200;
        t=th+tm+tc;
        total=(((t*20)/100)+t)/1000;
    

        System.out.println("total de carne :"+total+"kg");
        

    }
}