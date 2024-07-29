import java.util.Scanner;

public class Main {
    public static int [] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int sum = 0;
        for(int i = 0; i < n.length(); i++)
            sum = sum * a + (n.charAt(i) - '0');
        int num = 0;
        arr = new int [20];
        while(sum > 0){
            arr[num] = sum % b;
            sum /= b;
            num++;
        }
        for(int i = num - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}