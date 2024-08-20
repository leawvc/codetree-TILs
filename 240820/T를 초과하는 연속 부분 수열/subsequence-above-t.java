import java.util.Scanner;

public class Main {
    public static int value(int a, int b){
        if(a > b)
            return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr [] = new int [1000];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max = 0, a = 1, b = 1, cnt = 0;
        for(int i = 1; i < n; i++){
            if((arr[i - 1] < arr[i]) && (t < arr[i]))
                a++;
            else if((arr[i - 1] > arr[i]) && (t < arr[i]))
                b++;
            else {
                cnt = value(a, b);
                if (cnt > max) {
                    max = cnt;
                }
                a = 1;
                b = 1;
            }
        }
        cnt = value(a, b);
        if(cnt > max)
            max = cnt;
        System.out.print(max);
    }
}