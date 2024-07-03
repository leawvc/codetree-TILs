import java.util.Scanner;

public class Main {
    public static int [] arr;
    public static int n;
    public static int max;
    public static int maxValue(int idx){
        if(idx + 1 == n)
            return max;
        if(arr[idx] > max)
            max = arr[idx];
        return maxValue(idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        max = arr[0];
        System.out.print(maxValue(0));
    }
}