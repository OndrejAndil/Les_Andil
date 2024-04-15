package skola;

import java.util.Scanner;

public class Student extends Osoba {

    private String obor;

    public Student() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vybraný obor: ");
        String obor = sc.nextLine();

        this.obor= obor;
    }
}


