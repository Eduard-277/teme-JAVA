package exercitiul2;

import java.util.Random;

public class Vers {
    private String linie;

    Vers(String linie)
    {
        this.linie = linie;
    }

    public int nr_cuv()
    {
        int nr_cuv=0;
        char a;
        for(int i=0;i<linie.length();i++)
        {
                a=linie.charAt(i);
                if(a==' ')
                {
                    ++nr_cuv;
                }

        }
        return nr_cuv+1;
    }

    public int nr_vocale()
    {
        int voc=0;
        char a;
        for(int i=0;i<linie.length();i++)
        {
            a=linie.charAt(i);
            if("aeiou".indexOf(a)!=-1)
                ++voc;
        }
        return voc;
    }

    public boolean grupare(String grup)
    {
        if(linie.endsWith(grup))
            return true;
        else
            return false;
    }

    public boolean majuscule()
    {
        Random r=new Random();
        double x=r.nextDouble(1);
        if(x<0.1)
            return true;
        else
            return false;
    }

    public String toString()
    {
        return linie;
    }

}
