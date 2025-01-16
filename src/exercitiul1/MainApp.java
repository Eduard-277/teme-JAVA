package exercitiul1;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti lungimea: ");
        int lungimea = scanner.nextInt();
        while(lungimea<=0)
        {
            System.out.print("Introduceti lungimea >0: ");
            lungimea = scanner.nextInt();
        }
        System.out.print("Introduceti latimea: ");
        int latimea = scanner.nextInt();
        while(latimea<=0)
        {
            System.out.print("Introduceti latimea >0: ");
            latimea = scanner.nextInt();
        }
        System.out.println("Perimetrul dreptunghiului este: "+ (2*lungimea+2*latimea));
        System.out.println("Aria dreptunghiului este: "+ lungimea*latimea);
    }
}
