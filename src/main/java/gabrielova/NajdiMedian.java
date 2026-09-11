package gabrielova;

import java.util.ArrayList;
import java.util.Scanner;

public class NajdiMedian {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();

        ArrayList<Double> cisla = new ArrayList<>();

        while (true) {
            double vstup = sc.nextDouble();
            if (vstup == 0) {
                break;
            }
            cisla.add(vstup);}

        double soucet = 0;
        for (double c : cisla) {
            soucet += c;
        }
        double prumer = soucet / cisla.size();

        //int x = 13;

        //System.out.println("Medián je: " + x);
    }
}