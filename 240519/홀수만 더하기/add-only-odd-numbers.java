import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b;
        
        a = sc.nextInt();

        int sumVal = 0;

        for(int i = 0; i < a; i++){
            b = sc.nextInt();
            if(b % 2 != 0 && b % 3 == 0)
                sumVal += b;
        }
        System.out.print(sumVal);
    }
}