import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        
        a = sc.nextInt();

        int sumVal = 0;

        for(int i = a; i <= 100; i++){
            sumVal += i;
        }
        System.out.print(sumVal);
    }
}