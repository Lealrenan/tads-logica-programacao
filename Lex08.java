import java.util.Scanner;

public class Lex08{
    public static void main (String [] args){
        Scanner renan = new Scanner (System.in);

        int eleitor,validos,branco,nulos;
        int pv,pb,pn;

        System.out.println("Numero total de Eleitores");
        eleitor=renan.nextInt();
        System.out.println("votos validos:");
        validos=renan.nextInt();
        System.out.println("votos em branco:");
        branco=renan.nextInt();
        System.out.println("votos nulos:");
        nulos=renan.nextInt();

        pv= ((eleitor-(branco+nulos))*100)/eleitor;
        pb=(branco*100)/eleitor;
        pn=(nulos*100)/eleitor;
                
        

        System.out.println("Percentual Valido: "+pv);
        System.out.println("Percentual Branco: "+pb);
        System.out.println("Percentual nulos: "+pn);

    }
}