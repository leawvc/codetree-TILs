import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b, sum = 0;

        b = sc.nextInt();
        for(int i = 1; i < b; i++){
            if(b % i == 0)
                sum += i;
        }
        System.out.print(sum == b ? "P" : "N");
    }
}