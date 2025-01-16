package exercitiul4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        Random rand = new Random();
        Integer x = rand.nextInt(31);
        Integer y = rand.nextInt(31);
        Integer r;

        System.out.println(x);
        System.out.println(y);

        while(y!=0)
        {
            r=x%y;
            x=y;
            y=r;
        }

        System.out.println("Cmmdc-ul celor 2 numere introduse este: " + x);

    }
}
