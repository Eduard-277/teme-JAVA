package ex2_tema;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import exemplu1.Persoana;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    /**
     * Scrierea listei de perechi de numere intr-un fisier JSON
     * @param lista Lista de perechi care vor fi scrise in fisierul de tip JSON
     */
    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/perechi.json");
            mapper.writeValue(file,lista);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Citirea listei de perechi de numere dintr-un fisier JSON
     * @return Lista de tip PerecheNumere care contine datele din fisierul JSON
     */
    public static List<PerecheNumere> citire() {
        try {
            File file = new File("src/main/resources/perechi.json");
            ObjectMapper mapper = new ObjectMapper();
            List<PerecheNumere> perechi = mapper.readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return perechi;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Afisarea fiecarei perechi din lista si informatiile despre acestea:
     * cmmmc-ul lor.
     * daca sunt nr consec Fibonacci.
     * daca au suma cifrelor egale .
     * daca au acelasi numr de cifre poare.
     */
    public static void main(String[] args) {

        List<PerecheNumere> perechi=new ArrayList<PerecheNumere>();
        perechi.add(new PerecheNumere(5,8));
        perechi.add(new PerecheNumere(4,24));
        perechi.add(new PerecheNumere(121,4));

        for(PerecheNumere pair : perechi) {
            System.out.println(pair);
            System.out.println("Sunt nr consecutive Fibonacci: "+pair.consec_fibo());
            System.out.println("CMMMC-ul lor este: "+pair.cmmmc());
            System.out.println("Au suma cifrelor egale: "+pair.s_cif_equal());
            System.out.println("Au acelasi nr de cifre pare: "+pair.nr_cif_pare_equal());
        }

        scriere(perechi);

    }
}
