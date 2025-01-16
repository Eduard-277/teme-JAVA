
import java.io.Serializable;
/**
 * Clasificarea situatiilor disponibile
 */
enum Situatii{
    ACHIZITIONAT,
    EXPUS,
    VANDUT
}
/**
 * Clasificarea tipurilor de echipamente disponibile
 */
enum Tipuri{
    IMPRIMANTA,
    COPIATOR,
    SISTEM_DE_CALCUL
}
/**
 * Clasificarea zonelor de magazin disponibile
 */
enum Zona_mag{
    A,
    B,
    C,
    D
}
/**
 * Echipament este o generalizare a produselor
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class Echipament implements Serializable {
    private String denumire;
    private int nr;
    private float pret;
    private Zona_mag zona_mag;
    private Situatii situatie;
    private Tipuri tip;

    /**
     * Constructorul clasei Echipament
     * @param denumire numele imprimantei
     * @param nr numar de inventar
     * @param pret pretul echipamentului
     * @param zona_mag zona din magazie
     * @param situatie situatie echipament
     * @param tip identificatorul de particularizare
     */
    public Echipament(String denumire, int nr, float pret, Zona_mag zona_mag, Situatii situatie, Tipuri tip) {
        this.denumire = denumire;
        this.nr = nr;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.situatie = situatie;
        this.tip = tip;
    }
    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta informatiile despre echipament
     */
    public String toString() {
        return "Denumire: "+denumire + ", Nr: "+ nr + ", Pret: " + pret + ", Zona_mag: " + zona_mag + ", Situatie: " + situatie;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine tipul echipamentului
     * @return tip echipament
     */
    public Tipuri getTipuri() {
        return tip;
    }
    /**
     * Getter care da acces de citire a variabilei membre care contine situatia echipamentului
     * @return situatie echipament
     */
    public Situatii getSituatie() {
        return situatie;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine situatia echipamentului
     * @param situatie situatia echipamentului
     */
    public void setSituatie(Situatii situatie) {
        this.situatie = situatie;
    }


}
