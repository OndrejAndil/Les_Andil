package skola;

import java.util.Scanner;
public class Ucitel extends Osoba {

    private String predmet;

    public Ucitel() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hlavní předmět: ");
        String predmet = sc.nextLine();

        this.predmet= predmet;
    }
}
