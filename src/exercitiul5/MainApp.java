package exercitiul5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        Random rand = new Random();
        Integer n = rand.nextInt(21);
        Integer a=0, b=1, aux;
        Boolean ok=false;

        while(n>=b && ok==false)
        {
            if(n==b)
            {
                ok=true;
            }
            aux=b;
            b=a+b;
            a=aux;
        }

        if(ok==true || n==0)
        {
            System.out.println("Numarul " + n + " apartine sirului lui Fibonacci");
        }
        else
            System.out.println("Numarul " + n + " NU apartine sirului lui Fibonacci");

    }
}
