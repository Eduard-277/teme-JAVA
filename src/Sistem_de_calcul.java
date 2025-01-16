
import java.io.Serializable;

/**
 * Clasificarea sistemelor_de_operare disponibile
 */
enum OS{
    WINDOWS,
    LINUX
}

/**
 * Sistem_de_calcul este o particularizare a unui echipament
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class Sistem_de_calcul extends Echipament implements Serializable {
    private String tip_mon;
    private float vit_proc;
    private int c_hdd;
    private OS os;

    /**
     * Constructorul clasei Sistem_de_calcul
     * @param denumire numele sistemului_de_calcul
     * @param nr numar de inventar
     * @param pret pretul echipamentului
     * @param zona_mag zona din magazie
     * @param situatie situatie echipament
     * @param tip identificatorul de particularizare
     * @param tip_mon tip de monitor
     * @param vit_proc viteza procesor
     * @param c_hdd capacitate hard-drive
     * @param os sistem de operare
     */
    public Sistem_de_calcul(String denumire, int nr, float pret, Zona_mag zona_mag, Situatii situatie, Tipuri tip, String tip_mon, float vit_proc, int c_hdd, OS os)
    {
        super(denumire, nr, pret, zona_mag, situatie, tip);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.os = os;
    }

    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta informatiile despre echipament
     */
    @Override
    public String toString() {
        return super.toString()+", Tip monitor: "+tip_mon+", Vit_proc: "+vit_proc+", Capacitate_hdd: "+c_hdd+", OS: "+os;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine sistemul de operare a echipamentului
     * @param os Sistemul_de_operare cu care se doreste inlocuirea
     */
    public void setOs(OS os) {
        this.os = os;
    }
}

