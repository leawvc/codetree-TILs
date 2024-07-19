import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Distance implements Comparable<Distance>{
    int x, index;

    public Distance(int x, int index){
        this.x = x;
        this.index = index;
    }
    @Override 
    public int compareTo(Distance distance){
        return this.x - distance.x;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Distance [] distances = new Distance[n];
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            distances[i] = new Distance(x, i);
        }
        Arrays.sort(distances);
        for(int i = 0; i < n; i++)
            arr[distances[i].index] = i + 1;
        for(int i : arr)
            System.out.print(i + " ");
    }
}