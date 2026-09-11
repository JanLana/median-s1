import java.sql.Array;
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int input=sc.nextInt();
    List<Integer> arr = new ArrayList<Integer>(input);
    while(input!=0) {
        input = sc.nextInt();
        arr.add(input);
    }
    Collections.sort(arr);

    int hodnota = 0;

    if(arr.size()%2 != 0) {
        hodnota = arr.size()/2;
    } else hodnota = (arr.size()-1)/2;

    System.out.println(arr.get(hodnota));

}
