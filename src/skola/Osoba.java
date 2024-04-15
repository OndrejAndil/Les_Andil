package skola;

import java.util.Scanner;

public class Osoba {

    private String jmeno;
    private String rok;

    public Osoba() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Jméno: ");
        String jmeno= sc.nextLine();

        System.out.println("Rok narození: ");
        String rok= sc.nextLine();

        this.jmeno= jmeno;
        this.rok= rok;
    }
}
