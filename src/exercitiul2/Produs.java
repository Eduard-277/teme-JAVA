package exercitiul2;

import java.time.LocalDate;

public class Produs {
    private String nume;
    private float pret;
    private int qty;
    private LocalDate data;
    static float incasari;
    public Produs(String nume, float pret, int qty, LocalDate data) {
        this.nume = nume;
        this.pret = pret;
        this.qty = qty;
        this.data = data;
    }

    public String getNume() {
        return nume;
    }
    public int getQty() {
        return qty;
    }
    public LocalDate getData() {
        return data;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + ", Pret: " + pret + ", Qty: " + qty + ", Data: " + data;
    }

    boolean expirat()
    {
        return LocalDate.now().isAfter(data);
    }
}
