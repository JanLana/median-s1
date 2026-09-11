package vopravil;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class median {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> cisla = new ArrayList<>();
        int cislo;
        while (true) {
            cislo = input.nextInt();
            if (cislo == 0) {
                break;
            }
            cisla.add(cislo);
        }
        Collections.sort(cisla);
        int pocet = cisla.size();
        int median = cisla.get(pocet / 2);
        System.out.println(median);
    }
}