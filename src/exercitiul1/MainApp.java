package exercitiul1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

    public static void afis(String[]v, Integer ct) {
        for(int i=0;i<ct;i++)
            System.out.println(v[i]);
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        BufferedReader flux_in = new BufferedReader(new FileReader("judete_in.txt"));
        Integer ct=1;
        String[] judete = new String[41];
        String linie = flux_in.readLine();
        judete[0]=linie;


        while(linie!=null)
        {
            linie = flux_in.readLine();
            if(linie!=null)
            {
            judete[ct]=linie;
            ++ct;
            }
        }
        afis(judete,ct);
        Arrays.sort(judete,0,ct-1);
        afis(judete,ct);

        System.out.println("Introduceti judetul: ");
        String linie_noua = new String(scanner.nextLine());
        int poz= Arrays.binarySearch(judete,0,ct,linie_noua);
        System.out.print("Judetul "+ linie + " se afla pe pozitia "+(poz+1));

    }

}
