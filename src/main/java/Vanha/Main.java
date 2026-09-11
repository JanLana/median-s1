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
            a = sc.nextInt();
        }

        Collections.sort(arr);

        int n = arr.size();
        double median;

    }
}
