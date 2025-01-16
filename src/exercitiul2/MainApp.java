package exercitiul2;

import exercitiul1.Parabola;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static exercitiul2.Produs.incasari;

public class MainApp {

    public static void afis_pret_min(List<Produs> produse)
    {
        float minim=produse.get(0).getPret();
        for (int i = 0; i < produse.size(); i++) {
            if(produse.get(i).getPret()<minim)
                minim=produse.get(i).getPret();
        }
        for (int i = 0; i < produse.size(); i++)
        {
            if(produse.get(i).getPret()==minim)
            System.out.println(produse.get(i));
        }
    }

    public static void salvare(List<Produs> produse,int qty) throws FileNotFoundException {
        PrintStream flux_out = new PrintStream("date.out");
        for (int i = 0; i < produse.size(); i++)
        {
            if(produse.get(i).getQty()<qty)
                flux_out.println(produse.get(i).getNume()+","+produse.get(i).getPret()+","+produse.get(i).getQty()+","+produse.get(i).getData());
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

        List<Produs> produse=new ArrayList<Produs>();
        Scanner scanner= new Scanner(System.in);
        Scanner scanner_f = new Scanner(new File("produse.csv"));
        int indice=-1;
        int s;
        String[] linie;
        String nume;
        float pret;
        int qty;
        LocalDate data;
        incasari=0;

        while(scanner_f.hasNextLine())
        {
            linie = scanner_f.nextLine().split(",");
            nume = linie[0];
            pret = Float.parseFloat(linie[1]);
            qty = Integer.parseInt(linie[2]);
            data= LocalDate.parse(linie[3]);
            produse.add(new Produs(nume,pret,qty,data));
        }

        do{
            System.out.println("0.Inchidere aplicatie");
            System.out.println("1.Afisare produse");
            System.out.println("2.Afisare produse expirate");
            System.out.println("3.Vanzare produse");
            System.out.println("4.Afisare prod cu pret minim");
            System.out.println("5.Salvare produse cu qty mai mica decat cea data");
            s=scanner.nextInt();

            switch(s) {
                case 0:
                    System.out.println("La revedere!");
                    break;
                case 1:
                    for (Produs p : produse) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Produse expirate:");

                    for (Produs p : produse) {
                        if (p.expirat())
                            System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Ce produs doriti sa cumparati?");
                    for (Produs p : produse) {
                        System.out.println(p);
                    }
                    scanner.nextLine();
                    do {
                        System.out.println("Introduceti numele produsului dorit:");
                        nume = scanner.nextLine();
                        for (int i = 0; i < produse.size(); i++) {
                            if (produse.get(i).getNume().equals(nume))
                                indice=i;
                        }
                    }while(indice<0);
                    do {
                        System.out.println("Introduceti cantitatea dorita:");
                        qty = scanner.nextInt();
                    }while(qty>produse.get(indice).getQty() || qty<0);

                    incasari=incasari+qty * produse.get(indice).getPret();
                    if(qty==produse.get(indice).getQty())
                        produse.remove(produse.get(indice));
                    else
                        produse.get(indice).setQty(produse.get(indice).getQty()-qty);

                    System.out.println("Valoare incasari: "+incasari);
                    break;
                case 4:
                    afis_pret_min(produse);
                    break;
                case 5:
                    System.out.println("Introduceti cantitatea dorita:");
                    qty = scanner.nextInt();
                    salvare(produse,qty);
                    break;
                default:
                    System.out.println("Valoare gresita!");
                    break;
            }
        }while(s!=0);
    }
}
