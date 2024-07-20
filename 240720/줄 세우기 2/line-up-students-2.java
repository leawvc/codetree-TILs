import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Distance implements Comparable<Distance>{
    int h, w, index;

    public Distance(int h, int w, int index){
        this.h = h;
        this.w = w;
        this.index = index;
    }
    @Override 
    public int compareTo(Distance distance){
        if(this.h == distance.h)
            return distance.w - this.w;
        return this.h - this.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Distance [] distances = new Distance[n];

        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            distances[i] = new Distance(h, w, i + 1);
        }
        Arrays.sort(distances);
        for(int i = 0; i < n; i++)
            System.out.println(distances[i].h + " " + distances[i].w + " " + distances[i].index + " ");
    }
}