import java.util.Scanner;

public class Main {
    // public static int max_value(int plus, int minus){
    //     if(plus > minus)
    //         return plus;
    //     return minus;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[1000];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int max_plus = 0, max_minus = 0, plus = 1, minus = 1;
        for(int i = 1; i < n; i++){
            if((arr[i - 1] < arr[i]) && (arr[i - 1] > t))
                plus++;
            else{
                if(plus > max_plus){
                    max_plus = plus;
                }
                plus = 1;
            }
        }
        if(plus > max_plus) {
            max_plus = plus;
        }
        for(int i = 1; i < n; i++){
            if((arr[i - 1] > arr[i]) && (arr[i - 1] > t))
                minus++;
            else{
                if(minus > max_minus){
                    max_minus = minus;
                }
                minus = 1;
            }
        }
        if(minus > max_minus) {
            max_minus = minus;
        }
        if(max_minus > max_plus)
            System.out.print(max_minus);
        else
            System.out.print(max_plus);
    }
}