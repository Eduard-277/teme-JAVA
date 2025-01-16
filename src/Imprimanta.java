
import java.io.Serializable;
/**
 * Clasificarea modurilor de tiparire disponibile
 */
enum Mod_tiparire{
    COLOR,
    NEGRU
}
/**
 * Imprimanta este o particularizare a unui echipament
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class Imprimanta extends Echipament implements Serializable {
    private int ppm;
    private String rezolutie;
    private int p_car;
    private Mod_tiparire mod_tip;

    /**
     * Constructorul clasei Imprimanta
     * @param denumire numele imprimantei
     * @param nr numar de inventar
     * @param pret pretul echipamentului
     * @param zona_mag zona din magazie
     * @param situatie situatie echipament
     * @param tip identificatorul de particularizare
     * @param ppm pagini scrise pe minut
     * @param rezolutie numar de puncte pe inch
     * @param p_car numar de pagini per cartus
     * @param mod_tip mod de tiparire
     */
    public Imprimanta(String denumire, int nr, float pret, Zona_mag zona_mag, Situatii situatie, Tipuri tip, int ppm, String rezolutie, int p_car, Mod_tiparire mod_tip) {
        super(denumire, nr, pret, zona_mag, situatie, tip);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tip = mod_tip;
    }
    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta informatiile despre echipament
     */
    @Override
    public String toString() {
        return super.toString() + ", Ppm: "+ppm+", Rezolutie: "+rezolutie+", Pagini/cartus: "+p_car+", Mod tiparire: "+mod_tip;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine modul de tiparire a imprimantei
     * @param mod_tip Modul de tiparire cu care se doreste inlocuirea
     */
    public void setMod_tip(Mod_tiparire mod_tip) {
        this.mod_tip = mod_tip;
    }
}
