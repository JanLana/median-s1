package JakubTuma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NajdiMedian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int cislo = input.nextInt();
        while (cislo != 0) {
            arr.add(cislo);
            cislo = input.nextInt();
        }

        Collections.sort(arr);
        int stred = arr.size() / 2;
        if (arr.size() % 2 == 1) {
            System.out.println("Medián je: " + arr.get(stred));
        } else {
            double median = (arr.get(stred - 1) + arr.get(stred)) / 2.0;
            System.out.println("Medián je: " + median);
        }
    }
}