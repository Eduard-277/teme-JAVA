package ex3_tema;

import java.util.List;
/**
 * Placa contine informatii despre mobilier si metode de prelucrare ale acestor informatii
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class Mobilier {
    private String nume;
    private List<Placa> placi;

    /**
     * Constructor gol al clasei
     */
    public Mobilier(){}

    /**
     * Constructor cu parametrii al clasei
     * @param nume numele mobilierului
     * @param placi lista de placi necesare constructiei
     */
    public Mobilier(String nume, List<Placa> placi) {
        this.nume = nume;
        this.placi = placi;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine numele mobilierului
     * @param nume numele mobilierului
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine lista de placi necesare realizarii mobilierului
     * @param placi lista de placi necesare realizarii mobilierului
     */
    public void setPlaci(List<Placa> placi) {
        this.placi = placi;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine numele mobilierului
     * @return numele mobilierului
     */
    public String getNume() {
        return nume;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine lista de placi necesare realizarii mobilierului
     * @return lista de placi necesare realizarii mobilierului
     */
    public List<Placa> getPlaci() {
        return placi;
    }

    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta informatii despre mobilier
     */
    public String toString() {
        return nume + " " + placi;
    }
}
