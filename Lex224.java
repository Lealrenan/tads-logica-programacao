import java.util.Scanner;

public class Lex224{
    public static void main (String [] args){
        Scanner rl = new Scanner (System.in);

        
        int hom1,hom2,mul1,mul2,soma=0;

        System.out.println(" Homens digite suas idades  ");
        hom1=rl.nextInt(); 
        hom2=rl.nextInt();
        System.out.println(" Mulheres digite suas idades");
        mul1=rl.nextInt();
        mul2=rl.nextInt();


        if(hom1>hom2 && mul1<mul2){
             soma=hom1+mul1;
        }else if(hom2>hom1 && mul2<mul1){
             soma=hom2+mul2;
        }else if(hom1>hom2 && mul2<mul1){
             soma=hom1+mul2;
        }else if(hom2>hom1 && mul1<mul2){
             soma=hom2+mul1;
        }

        System.out.println(" idades digitadas homens "+hom1+" e "+hom2);
        System.out.println("idades digitadas mulheres "+mul1+" e "+mul2 );
        System.out.println("Soma das maiores idades"+soma);
                

        
    }
}