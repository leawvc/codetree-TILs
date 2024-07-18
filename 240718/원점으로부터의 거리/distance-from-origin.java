import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Distance implements Comparable<Distance>{
    int x, y;

    public Distance(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override 
    public int compareTo(Distance distance){
        return (Math.abs(this.x - distance.x) + Math.abs(this.y - distance.y));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Distance [] distances = new Distance[n];
        Distance [] distances1 = new Distance[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            distances[i] = new Distance(x, y);
            distances1[i] = new Distance(x, y);
        }
        Arrays.sort(distances);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(distances[i].x == distances1[j].x && distances[i].y == distances1[j].y )
                    System.out.println(j + 1);
            }
        }
    }
}