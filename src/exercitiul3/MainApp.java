package exercitiul3;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Integer n;
        Boolean ok=false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unsigned!=0 n: ");
        n = scanner.nextInt();
        while(n<=0)
        {
            System.out.print("Enter UNSIGNED!=0 n: ");
            n = scanner.nextInt();
        }

        if(n!=1) {

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ok = true;
                    System.out.println(i);
                    if (n / i != i)
                        System.out.println(n / i);
                }
            }

            if (ok)
                System.out.println(1 + "\n" + n);
            else
                System.out.println("Numarul citit este prim");
        }
        else
            System.out.println(1);
    }
}
