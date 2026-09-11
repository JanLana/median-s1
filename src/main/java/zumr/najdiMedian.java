package zumr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class najdiMedian {
    static void main(){

        Scanner sc = new Scanner(System.in);
        List<Integer> cisla = new ArrayList<>();
            int a = sc.nextInt();

            while(a!= 0){
                cisla.add(a);
                a= sc.nextInt();
            }
            Collections.sort(cisla);

            double median;
            int size = cisla.size();

            if(size % 2 == 1){
            median = cisla.get(size / 2);
            }else{
                median = (cisla.get((size / 2) - 1) + cisla.get(size / 2)) / 2.0;
            }
            System.out.println("Median je " + median);

    }
}
