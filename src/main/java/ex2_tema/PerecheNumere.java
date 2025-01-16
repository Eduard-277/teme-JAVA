package ex2_tema;
/**
 * PerecheNumere contine perechi de cate 2 numere si metode de analiza a acestora
 * @author Eduard
 * @version 1
 * @since 2024
 */
public class PerecheNumere {
    private Integer num;
    private Integer num2;

    /**
     * Constructor gol al clasei
     */
    public PerecheNumere() {}

    /**
     * Constructor al clasei care primeste perechea de numere si le salveaza in ordine crescatoare
     * @param num elementul mai mic al perechii
     * @param num2 elementul mai mare al perechii
     */
    public PerecheNumere(int num, int num2) {
        if(num<num2) {
            this.num = num;
            this.num2 = num2;
        }
        else
        {
            this.num = num2;
            this.num2 = num;
        }
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine numarul mai mic din pereche
     * @return numarul mai mic din pereche
     */
    public int getNum() {
        return num;
    }

    /**
     * Getter care da acces de citire a variabilei membre care contine numarul mai mare din pereche
     * @return numarul mai mare din pereche
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine numarul mai mic din pereche.
     * Daca valoarea introdusa este mai mare decat cea din num2 se va realiza o interschimbare a acestora.
     * @param num numarul mai mic din pereche
     */
    public void setNum(int num) {
        if(num<num2)
            this.num = num;
        else {
            this.num=num2;
            this.num2 = num;
        }
    }

    /**
     * Setter care da acces de scriere a variabilei membre care contine numarul mai mare din pereche.
     * Daca valoarea introdusa este mai mica decat cea din num se va realiza o interschimbare a acestora.
     * @param num2 numarul mai mare din pereche
     */
    public void setNum2(int num2) {
        if(num2>num)
            this.num2 = num2;
        else
        {
            this.num2 = num;
            this.num = num2;
        }
    }
    /**
     * Suprascriere metoda pt afisare pe consola in mod formatat
     * @return String care prezinta perechea de numere
     */
    @Override
    public String toString() {
        return "(" + num + "," + num2 + ")";
    }

    /**
     * Verifica daca perechea de numere contine 2 numere consecutive care fac parte din sirul lui Fibonacci
     * @return true daca cele 2 numere sunt consecutive, altfel false
     */
    public boolean consec_fibo()
    {
        Integer a=0, b=1, aux;
        Boolean ok=false;

        while(num>=b && ok==false)
        {
            if(num==b)
            {
                ok=true;
            }
            aux=b;
            b=a+b;
            a=aux;
        }
        if( (ok==true || num==0) && num2==b )
            return true;

        return false;
    }

    /**
     * Calculeaza cel mai mic multiplu comun al celor 2 numere din pereche.
     * @return (int) cmmmc-ul celor 2 numere
     */
    public int cmmmc()
    {
        Integer n1=num,n2=num2;
        Integer r;
        while(n2!=0)
        {
            r=n1%n2;
            n1=n2;
            n2=r;
        }

        return (num*num2)/n1;
    }

    /**
     * Verifica daca suma cifrelor a fiecarui numar din pereche este egala
     * @return true daca sunt egale, altfel false
     */
    public boolean s_cif_equal()
    {
        Integer n1=num,n2=num2;
        Integer s1=0,s2=0;
        while(n1!=0)
        {
            s1=s1+n1%10;
            n1=n1/10;
        }
        while(n2!=0)
        {
            s2=s2+n2%10;
            n2=n2/10;
        }
        if(s1==s2)
            return true;

        return false;
    }

    /**
     * Verifica daca cele 2 numere din pereche au acelasi numar de cifre pare.
     * @return true daca au acelasi numar, altfel false
     */
    public boolean nr_cif_pare_equal()
    {
        Integer n1=num,n2=num2;
        Integer ct1=0,ct2=0;
        while(n1!=0)
        {
            if(n1%2==0)
                ct1++;
            n1=n1/10;
        }
        while(n2!=0)
        {
            if(n2%2==0)
                ct2++;
            n2=n2/10;
        }

        if(ct1==ct2)
            return true;

        return false;
    }


}
