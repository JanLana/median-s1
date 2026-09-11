package OndrejRoszkowski_Median;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> arr = new ArrayList<>();

        while (true) {
            double cislo = input.nextDouble();
            if (cislo == 0) break;
            arr.add(cislo);
        }

        Collections.sort(arr);
        int prostredniPozice = arr.size() / 2;
        double median = arr.get(prostredniPozice);

        if (arr.size() % 2 == 0) {
            median = (arr.get(prostredniPozice - 1) + arr.get(prostredniPozice)) / 2.0;
        }
        else {
            median = (arr.get(prostredniPozice));
        }
        System.out.println(median);
    }
}