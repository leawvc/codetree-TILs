import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] num = new int[n];

        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
            if(i % 2 == 0){
                Arrays.sort(num, 0, i + 1);
                System.out.print(num[i / 2] + " ");
            }
        }
    }
}