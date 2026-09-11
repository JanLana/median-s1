package rybnikardavid;

import java.util.*;

public class median {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();

        int cislo = input.nextInt();

        while (cislo != 0) {
            arr.add(cislo);
            cislo = input.nextInt();
        }

        Collections.sort(arr);


        System.out.println(arr.get(arr.size() / 2));
    }
}


