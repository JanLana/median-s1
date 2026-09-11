package rezac;

import java.util.ArrayList;
import java.util.Scanner;

public class NaleznutiMedianu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cisla = new ArrayList<>();

        int cislo;

        while ((cislo = sc.nextInt()) != 0) {
            cisla.add(cislo);
        }

      int median = cisla.get(cisla.size() / 2);

        System.out.println("Medián je: " +  median);
    }
}