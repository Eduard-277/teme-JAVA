package exercitiul2;

import java.io.*;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        BufferedReader flux_in = new BufferedReader(new FileReader("cantec_in.txt"));
        Integer ct=1;
        Vers[] versuri=new Vers[100];
        String linie = flux_in.readLine();
        versuri[0]=new Vers(linie);


        while(linie!=null)
        {
            linie = flux_in.readLine();
            if(linie!=null)
            {
                versuri[ct]=new Vers(linie);
                ++ct;
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti gruparea de litere: ");
        String grupare = new String(scanner.nextLine());

        PrintStream flux_out = new PrintStream("cantec_out.txt");

        Vers vers;

        for(int i=0;i<ct;++i)
        {
            vers=versuri[i];
            boolean b=vers.grupare(grupare);
            if(vers.grupare(grupare))
            {
                if(vers.majuscule())
                    flux_out.println(String.format("%-4s",vers.nr_cuv())+" " + String.format("%-4s",vers.nr_vocale())+" " + " *  "+ vers.toString().toUpperCase());
                else
                    flux_out.println(String.format("%-4s",vers.nr_cuv())+" " + String.format("%-4s",vers.nr_vocale())+" " + " *  "+ vers.toString());
            }
            else
            if(vers.majuscule())
                flux_out.println(String.format("%-4s",vers.nr_cuv())+" " +String.format("%-4s",vers.nr_vocale())+ "     "+vers.toString().toUpperCase());
            else
                flux_out.println(String.format("%-4s",vers.nr_cuv())+" " +String.format("%-4s",vers.nr_vocale())+  "     "+vers.toString());
        }

    }

}
