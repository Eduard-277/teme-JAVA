package exercitiul3;


import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti sir-ul: ");
        StringBuilder sir = new StringBuilder(scanner.nextLine());
        System.out.println("Introduceti sir-ul care sa fie inserat: ");
        StringBuilder sir2 = new StringBuilder(scanner.nextLine());
        System.out.println("Introduceti pozitia la care sa fie inserat sirul: ");
        Integer p =scanner.nextInt();
        sir.insert(p, sir2);
        System.out.println("Sir-ul construit final este: " + sir);
        scanner.nextLine();
        System.out.println("Introduceti sir-ul nr.2: ");
        sir = new StringBuilder(scanner.nextLine());
        System.out.println("Introduceti pozitia de la care sa se stearga din sir: ");
        p =scanner.nextInt();
        System.out.println("Introduceti cate caractere sa se stearga din sir: ");
        Integer nr =scanner.nextInt();

        sir.delete(p,p+nr);
        System.out.println("Sir-ul construit final este: " + sir);

    }

}
