package pospisil;

import java.util.*;

public class Median {
    static void main() {
        Scanner sc = new Scanner(System.in);
        List<Integer> cisla = new ArrayList<>();

        while (true) {
            if (sc.hasNextInt()) {
                int cislo = sc.nextInt();
                if (cislo == 0) {
                    break;
                }
                cisla.add(cislo);
            } else {
                sc.next();
            }
        }

        if (cisla.isEmpty()) {
            System.out.println("zadej alespon jedno cele cislo");
        } else {
            Collections.sort(cisla);

            int median;
            int pocet = cisla.size();

            if (pocet % 2 == 1) {
                median = cisla.get(pocet / 2);
            } else {
                int stred1 = cisla.get((pocet / 2) - 1);
                int stred2 = cisla.get(pocet / 2);
                median = (stred1 + stred2) / 2;
            }

            System.out.println(median);
        }

        sc.close();
    }
}
