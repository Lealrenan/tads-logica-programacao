import java.util.Scanner;

public class Lex10{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        float ingresso=45;
        float socios,rsocio,nsocios,npagante;
        float ptotal, rtotal, deixou;
        float asocios,ansocios,adeixou;
        
        
        System.out.println("Socios");
        socios=renan.nextFloat();
        System.out.println("Nao Socios");
        nsocios=renan.nextFloat();
        System.out.println("Nao pagantes");
        npagante=renan.nextFloat();

        rsocio=(((ingresso*30)/100)-ingresso);
            asocios=socios*rsocio;
                ansocios=nsocios*ingresso;
                adeixou=npagante*ingresso;      

        ptotal=socios+nsocios+npagante;
            rtotal=(socios*rsocio)+(nsocios*ingresso);
                adeixou=rtotal-rsocio;
        
         

        System.out.println("Arrecadacao total socios : "+asocios);
        System.out.println("Arrecadacao total não socios: "+ansocios);
        System.out.println("publico total : "+ptotal);
        System.out.println("Arrecadacao Geral : "+rtotal);
        System.out.println("Deixou de arrecadas: "+adeixou);


        

    }
}