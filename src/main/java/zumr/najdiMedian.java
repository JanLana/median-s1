package zumr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    List<Double> numbers = new ArrayList<>();

    while(true){
        double a = sc.nextDouble();
        if(a==0)break;
        numbers.add(a);
    }
    Collections.sort(numbers);

    double median;

    if(numbers.size()%2 ==1) {
        median = numbers.get(numbers.size()/2);
    }else {
        int middle = numbers.size()/2 ;
        median = (numbers.get(middle - 1) + numbers.get(middle)) / 2.0;
    }
    System.out.println(median);
}
