package Vanha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main () {

        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<Integer>();


        int a = sc.nextInt();

        while (a != 0){
            arr.add(a);
            a = sc.nextInt();
        }

        Collections.sort(arr);

        int n = arr.size();
        int prostredniIndex = n / 2;

        if (n % 2 == 1) {
            System.out.println(arr.get(prostredniIndex));
        }
        else {
            int cislo1 = arr.get(prostredniIndex - 1);
            int cislo2 = arr.get(prostredniIndex);
            int median = (cislo1 + cislo2) / 2;
            System.out.println(median);
        }

    }
}
