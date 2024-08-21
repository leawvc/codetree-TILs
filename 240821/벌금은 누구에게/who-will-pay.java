import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] targetNums = new int[n];
        for(int i = 0; i < m; i++){
            int y = sc.nextInt();
            for(int j = 0; j < n; j++){
                if(j == (y - 1))
                    targetNums[j]++;
                if(targetNums[j] == k){
                    System.out.print(y);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}