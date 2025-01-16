package Exercitiu1;

import java.time.LocalDate;

public class Angajat {
    private String nume;
    private String post;
    private LocalDate data_angajare;
    private Float salariu;

    public Angajat(){}

    public Angajat(String nume, String post, LocalDate data_angajare, Float salariu) {
        this.nume = nume;
        this.post = post;
        this.data_angajare = data_angajare;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public String getPost() {
        return post;
    }

    public LocalDate getData_angajare() {
        return data_angajare;
    }

    public Float getSalariu() {
        return salariu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setData_angajare(LocalDate data_angajare) {
        this.data_angajare = data_angajare;
    }

    public void setSalariu(Float salariu) {
        this.salariu = salariu;
    }

    public String toString(){
        return nume + ", " + post + ", " + data_angajare + ", " + salariu;
    }
}
