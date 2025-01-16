package Exercitiu1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {

    public static void scriere(List<Angajat> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            File file=new File("src/main/resources/angajati.json");
            mapper.writeValue(file,lista);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Angajat> citire() {
        try {
            File file = new File("src/main/resources/angajati.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            List<Angajat> angajati = mapper.readValue(file, new TypeReference<List<Angajat>>(){});
            return angajati;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void afisare_sal(List<Angajat> angajati, Predicate<Angajat> a)
    {
      for(Angajat angajat:angajati)
          if(a.test(angajat))
              System.out.println(angajat);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        List<Angajat> angajati = citire();
        Integer s,ct;

        do{
            System.out.println("0.Iesire");
            System.out.println("1.Afisare angajati");
            System.out.println("2.Afisare angajati cu sal > 2500 lei");
            System.out.println("3.Afisare angajati cu rolul de sef sau director angajati in luna aprilie a anului trecut");
            System.out.println("4.Angajati care nu au functie de conducere in ordine descrescatoare dupa salar");
            System.out.println("5.Lista numelor angajatilor din firma");
            System.out.println("6.Afisare doar salarii mai mici de 3000 lei");
            System.out.println("7.Afisarea datelor primului angajat al firmei");
            System.out.println("8.Afisare salar minim, maxim si mediu");
            System.out.println(("9.Verificare existenta angajat cu numele Ion"));
            System.out.println("10.Afisare numar de persoane angajate in vara anului trecut");
            System.out.println("Optiunea dvs: ");
            s=scanner.nextInt();
            switch(s)
            {
                case 0:
                    System.out.println("La revedere!");
                    break;
                case 1:
                    angajati.forEach(System.out::println);
                    break;
                case 2:
                    /*
                    afisare_sal(angajati,new Predicate<Angajat>(){
                        public boolean test(Angajat angajat){
                            return angajat.getSalariu()>2500;
                        }
                    });
                    */
                    angajati.stream().filter((a)->a.getSalariu()>2500).forEach(System.out::println);
                    break;
                case 3:
                    List<Angajat> selectie= angajati.stream().filter((a)->a.getPost().equalsIgnoreCase("sef") || a.getPost().equalsIgnoreCase("director")).filter((a)->a.getData_angajare().getMonthValue()==4 && a.getData_angajare().getYear()==LocalDate.now().getYear()-1).collect(Collectors.toList());
                    System.out.println("Angajati cu rolul de sef sau director angajati in luna aprilie a anului trecut:");
                    selectie.forEach(System.out::println);
                    break;
                case 4:
                    angajati.stream().filter((a)->a.getPost().equalsIgnoreCase("sef")==false && a.getPost().equalsIgnoreCase("director")==false).sorted((a1,a2)->Float.compare(a2.getSalariu(),a1.getSalariu())).forEach(System.out::println);
                    break;
                case 5:
                    List<String> nume= angajati.stream().map((a)->a.getNume().toUpperCase()).collect(Collectors.toList());
                    nume.forEach(System.out::println);
                    break;
                case 6:
                    angajati.stream().map((a)->a.getSalariu()).filter((sal)->sal<3000).forEach(System.out::println);
                    break;
                case 7:
                    angajati.stream().min((a1,a2)->a1.getData_angajare().compareTo(a2.getData_angajare())).ifPresentOrElse(System.out::println,()-> System.out.println("Valoare lipsa"));
                    break;
                case 8:
                    DoubleSummaryStatistics stats=angajati.stream().collect(Collectors.summarizingDouble(Angajat::getSalariu));
                    System.out.println("Salariul minim este: "+ stats.getMin());
                    System.out.println("Salariul maxim este: "+ stats.getMax());
                    System.out.println("Salariul mediu este: "+ stats.getAverage());
                    break;
                case 9:
                    angajati.stream().filter(a->a.getNume().equalsIgnoreCase("ion")).findAny().ifPresentOrElse( (a)-> System.out.println("Firma are cel putin un Ion angajat"), ()-> System.out.println("Nu exista niciun angajat cu numele Ion"));
                    break;
                case 10:
                    ct= (int) angajati.stream().filter((a)->a.getData_angajare().getYear()==LocalDate.now().getYear()-1).filter((a)->a.getData_angajare().getMonthValue()>=6 && a.getData_angajare().getMonthValue()<=8).count();
                    System.out.println(ct);
                    break;
            }

        }while(s!=0);
    }

}
