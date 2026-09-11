package rezac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NaleznutiMedianu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int cislo;

        while ((cislo = sc.nextInt()) != 0) {
            arr.add(cislo);
        }

        Collections.sort(arr);

        int median = arr.get(arr.size() / 2);
        System.out.println("Medián je: " + median);
    }
}