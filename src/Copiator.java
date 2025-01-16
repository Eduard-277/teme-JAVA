
import java.io.Serializable;
/**
 * Clasificarea formaturilor de copiere disponibile
 */
enum Format{
    A3,
    A4
}
/**
 * Copiator este o particularizare a unui echipament
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class Copiator extends Echipament implements Serializable {
    private int p_ton;
    private Format format;

    /**
     * Constructorul clasei Copiator
     * @param denumire numele imprimantei
     * @param nr numar de inventar
     * @param pret pretul echipamentului
     * @param zona_mag zona din magazie
     * @param situatie situatie echipament
     * @param tip identificatorul de particularizare
     * @param p_ton nr de pagini per toner
     * @param format formatul de copiere
     */
    public Copiator(String denumire, int nr, float pret, Zona_mag zona_mag, Situatii situatie, Tipuri tip, int p_ton, Format format)
    {
        super(denumire, nr, pret, zona_mag, situatie, tip);
        this.p_ton = p_ton;
        this.format = format;
    }
    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta informatiile despre echipament
     */
    @Override
    public String toString() {
        return super.toString()+", Pagini/toner: "+p_ton+", Format: "+format;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine formatul de copiere al copiatorului
     * @param format Formatul de copiere cu care se doreste inlocuirea
     */
    public void setFormat(Format format) {
        this.format = format;
    }
}

