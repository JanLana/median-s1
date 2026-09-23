package rezac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NaleznutiMedianu {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> cisla = new ArrayList<>();
        int cislo;
        while ((cislo = sc.nextInt()) != 0) {
            cisla.add(cislo);
        }
        Collections.sort(cisla);


        int stred = cisla.size() / 2;
        double median;
        if (cisla.size() % 2 == 0) {
            median = (cisla.get(stred - 1) + cisla.get(stred)) / 2.0;
        } else {
            median = cisla.get(stred);
        }

        System.out.println("Medián je: " + median);
    }
}