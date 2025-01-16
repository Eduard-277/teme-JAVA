package exercitiul2;

import java.io.*;

public class MainApp {

    public static void main(String[] args) throws IOException {

        BufferedReader flux_in = new BufferedReader(new FileReader("in.txt"));
        String linie = flux_in.readLine();
        Integer suma=0, ct=0, mini=Integer.MIN_VALUE , maxi=Integer.MAX_VALUE;
        while(linie != null)
        {
            Integer x = Integer.parseInt(linie);
            suma+=x;
            if(x.compareTo(mini)>0)
                mini=x;
            if(x.compareTo(maxi)<0)
                maxi=x;
            ++ct;
            linie = flux_in.readLine();
        }

        PrintStream flux_out = new PrintStream("out.txt");

        System.out.println("Suma numerelor din fisier este: "+ suma);
        flux_out.println("Suma numerelor din fisier este: "+ suma);
        System.out.println("Media aritmetica a numerelor din fisier este: "+ (float)suma/ct);
        flux_out.println("Media aritmetica a numerelor din fisier este: "+ (float)suma/ct);
        System.out.println("Minimul numerelor din fisier este: "+ mini);
        flux_out.println("Minimul numerelor din fisier este: "+ mini);
        System.out.println("Maximul numerelor din fisier este: "+ maxi);
        flux_out.println("Maximul numerelor din fisier este: "+ maxi);

    }
}
