package exercitiul1;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static exercitiul1.Parabola.lungime;

public class MainApp {
    public static void main(String[] args) throws IOException {

        List<Parabola> parabole=new ArrayList<Parabola>();
        Scanner scanner= new Scanner(System.in);
        Scanner scanner_f = new Scanner(new File("in.txt"));
        int a,b,c;

        while(scanner_f.hasNextInt())
        {
            a = scanner_f.nextInt();
            b = scanner_f.nextInt();
            c = scanner_f.nextInt();
            parabole.add(new Parabola(a,b,c));
        }

        for(Parabola p:parabole)
        {
            System.out.println(p);
            System.out.println("Varful parabolei este: "+ p.varf());
        }

        do {
            System.out.println("Introduceti indicele primei parabole:");
            a = scanner.nextInt();
        }while (a>=parabole.size() || a<0);

        do{
        System.out.println("Introduceti indicele celei de-a doua parabole:");
        b = scanner.nextInt();
        }while (b>=parabole.size() || b<0);

        System.out.println("Mijlocul segmentului care le uneste varfurile este: " + parabole.get(a).mij_seg(parabole.get(b)));
        System.out.println("Lungimea segmentului care le uneste varfurile este: " + lungime(parabole.get(a),parabole.get(b)));
    }
}
