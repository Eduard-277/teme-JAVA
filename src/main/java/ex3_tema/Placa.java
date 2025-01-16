package ex3_tema;

import java.lang.reflect.Array;
/**
 * Placa contine informatii despre placi si metode de prelucrare ale acestor informatii
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class Placa {
    private String descriere;
    private Integer lungime;
    private Integer latime;
    private Orientare orientare;
    private boolean []canturi;
    private Integer nr_bucati;

    /**
     * Constructor gol al clasei
     */
    public Placa() {}

    /**
     * Constructor cu parametrii al clasei
     * @param descriere descrierea placii
     * @param lungime lungimea placii
     * @param latime latimea placii
     * @param orientare orientarea placii
     * @param canturi vector de 4 elemente care specifica prezenta pe fiecare dintre cele 4 muchii
     * @param nr_bucati nr de placi necesare
     */
    public Placa(String descriere, Integer lungime, Integer latime, Orientare orientare, boolean[] canturi, Integer nr_bucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine descrierea placii
     * @param descriere descrierea placii
     */
    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine lungimea placii
     * @param lungime lungimea placii
     */
    public void setLungime(Integer lungime) {
        this.lungime = lungime;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine latimea placii
     * @param latime latimea placii
     */
    public void setLatime(Integer latime) {
        this.latime = latime;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine orientarea placii
     * @param orientare orientarea placii
     */
    public void setOrientare(Orientare orientare) {
        this.orientare = orientare;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine prezenta pe cele 4 muchii a canturilor pe placa
     * @param canturi prezenta pe cele 4 muchii a canturilor
     */
    public void setCanturi(boolean[] canturi) {
        this.canturi = canturi;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine nr de placi necesare
     * @param nr_bucati nr de placi necesare
     */
    public void setNr_bucati(Integer nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine descrierea placii
     * @return descrierea placii
     */
    public String getDescriere() {
        return descriere;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine lungimea placii
     * @return lungimea placii
     */
    public Integer getLungime() {
        return lungime;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine latimea placii
     * @return latimea placii
     */
    public Integer getLatime() {
        return latime;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine orientarea placii
     * @return orientarea placii
     */
    public Orientare getOrientare() {
        return orientare;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine prezenta pe cele 4 muchii a canturilor pe placa
     * @return vector care contine prezenta pe cele 4 muchii a canturilor pe placa
     */
    public boolean[] getCanturi() {
        return canturi;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine nr de placi necesare
     * @return nr de placi necesare
     */
    public Integer getNr_bucati() {
        return nr_bucati;
    }
    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta informatiile despre placa
     */
    public String toString() {
        return "Descriere: "+descriere+", "+"Lungime: "+lungime+", "+"Latime: "+latime+", "+"Orientare: "+orientare+", "+"Muchie 1: "+canturi[0]+", "+"Muchie 2: "+canturi[1]+", "+"Muchie 3: "+canturi[2]+", "+"Muchie 4: "+canturi[3]+", "+"Nr. bucati: "+nr_bucati;
    }
}
