package Pitsur;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NajdiMedian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nactenaCisla = new ArrayList<>();
        int cislo;
        while (true) {
            cislo = input.nextInt();
            if (cislo == 0) {
                break;
            }
            nactenaCisla.add(cislo);
        }
        Collections.sort(nactenaCisla);
        int pocet = nactenaCisla.size();
        int median = nactenaCisla.get(pocet / 2);
        System.out.println(median);
    }
}