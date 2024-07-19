import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Distance implements Comparable<Distance>{
    int x, y, index;

    public Distance(int x, int y, int index){
        this.x = x;
        this.y = y;
        this.index = index;
    }
    @Override 
    public int compareTo(Distance distance){
        int thisDistance = Math.abs(this.x) + Math.abs(this.y);
        int otherDistance = distance.x + distance.y;
        return thisDistance - otherDistance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Distance [] distances = new Distance[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            distances[i] = new Distance(x, y, i + 1);
        }
        Arrays.sort(distances);
        for(int i = 0; i < n; i++)
            System.out.println(distances[i].index);
    }
}