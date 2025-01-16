package exercitiul4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persoana {
    private String nume;
    private String cnp;

    Persoana(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getVarsta()
    {
        LocalDate bday;
        char a=cnp.charAt(0);
        LocalDate date = LocalDate.now();
        String year = cnp.substring(1,3);
        String month = cnp.substring(3,5);
        String day = cnp.substring(5,7);
        if("12".indexOf(a)!=-1)
            bday = LocalDate.parse("19"+year+"-"+month+"-"+day);
        else
            bday = LocalDate.parse("20"+year+"-"+month+"-"+day);
        long  nr_ani= ChronoUnit.YEARS.between(bday,date);
        return nr_ani;
    }

    public void afisare()
    {
        System.out.println(this.nume+" "+this.cnp+" "+this.getVarsta());
    }

}
