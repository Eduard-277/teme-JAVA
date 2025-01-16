package exercitiul4;

import java.util.Scanner;

public class MainApp {

    static boolean verif_cnp(String cnp)
    {
        Integer suma_verif=0;
        char a;
        a=cnp.charAt(0);
        if("1256".indexOf(a)==-1 || cnp.length()!=13)
            return false;
        suma_verif+=Integer.parseInt(String.valueOf(a))*2;
        for(int i=1; i<13; i++)
        {
            a=cnp.charAt(i);
            if("0123456789".indexOf(a)==-1)
               return false;
            switch(i)
            {
                case 1:suma_verif+=Integer.parseInt(String.valueOf(a))*7; break;
                case 2:suma_verif+=Integer.parseInt(String.valueOf(a))*9; break;
                case 3:suma_verif+=Integer.parseInt(String.valueOf(a)); break;
                case 4:suma_verif+=Integer.parseInt(String.valueOf(a))*4; break;
                case 5:suma_verif+=Integer.parseInt(String.valueOf(a))*6; break;
                case 6:suma_verif+=Integer.parseInt(String.valueOf(a))*3; break;
                case 7:suma_verif+=Integer.parseInt(String.valueOf(a))*5; break;
                case 8:suma_verif+=Integer.parseInt(String.valueOf(a))*8; break;
                case 9:suma_verif+=Integer.parseInt(String.valueOf(a))*2; break;
                case 10:suma_verif+=Integer.parseInt(String.valueOf(a))*7; break;
                case 11:suma_verif+=Integer.parseInt(String.valueOf(a))*9; break;

            }
        }
        Integer control=suma_verif%11;
        if(control==10)
            control=1;
        if(control!=Integer.parseInt(String.valueOf(a)))
            return false;

        return true;

    }

    static void afisare(Persoana[] persoane)
    {
        for(Persoana p : persoane)
            p.afisare();
    }

    public static void main(String[] args) {

        String nume;
        String cnp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr de pers: ");
        Integer n =scanner.nextInt();
        scanner.nextLine();
        Persoana[] persoane= new Persoana[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Introduceti numele pers cu nr "+ (i+1) +": ");
            nume = new String(scanner.nextLine());
            System.out.println("Introduceti CNP-ul pers cu nr "+ (i+1) +": ");
            cnp = new String(scanner.nextLine());
            while(verif_cnp(cnp)==false)
            {
                System.out.println("CNP INTRODUS GRESIT: ");
                cnp = new String(scanner.nextLine());
            }
            persoane[i] = new Persoana(nume,cnp);
        }

        afisare(persoane);

    }
}
