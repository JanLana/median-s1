package Syska;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class FindMedian {
    static void main(){
        Scanner sc = new Scanner(System.in);
        Integer input = 1;
        List<Integer> arr = new ArrayList<Integer>();

        while (true) {
            input = sc.nextInt();
            if (input != 0) {
                arr.add(input);
            }
            else {
                break;
            }

        }

        for (int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }


        Collections.sort(arr);
        int x = -1;

        if (arr.size()%2 != 0){
            x = arr.get(arr.size() / 2);
        }
        else {
            x = arr.get(arr.size() / 2);
            x += arr.get(arr.size() / 2 +1);
            x = x/2;
        }


        System.out.println("Median je: " + x);
    }
}
