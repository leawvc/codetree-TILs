import java.util.Scanner;

public class Main {
    public static int back(int [] arr, int m){
        int result = 0;
        while(m > 0){
            result += arr[m - 1];
            if(m % 2 != 0)
                m -= 1;
            else
                m /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print(back(arr, m));
    }
}