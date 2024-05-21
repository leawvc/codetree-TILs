import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();
        
        for(int i = 1; i <= a; i++){
            if(i % 2 == 0 || (i % 3 == 0 && i % 9 != 0) || i % 5 == 0)
                continue;
            System.out.printf("%d ", i);
        }
    }
}