import java.util.Scanner;

public class Main {
    public static int [] arr;
    // 최대 공약수
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    // 최소 공배수 
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static int lcmArray(int[] arr, int n){
        if(n == 1)
            return arr[0];
        return lcm(arr[n - 1], lcmArray(arr, n - 1));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print(lcmArray(arr, n));
    }
}