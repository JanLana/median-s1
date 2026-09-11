package polakova;

import java.util.ArrayList;
import java.util.Scanner;

public class NajdiMedian {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int pocet = sc.nextInt();

        ArrayList<Double> cisla = new ArrayList<>();

        while (true) {
            double idk = sc.nextDouble();
            if (idk == 0) {
                break;
            }
            cisla.add(idk);}

        double soucet = 0;
        for (double c : cisla) {
            soucet += c;
        }
        double prumer = soucet / cisla.size();

        System.out.println(prumer + pocet);
    }
;}