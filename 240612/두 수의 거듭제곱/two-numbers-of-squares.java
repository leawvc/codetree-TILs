import java.util.Scanner;

public class Main {
    public static int double_math(int a, int b){
        int value = 1;
        for(int i = 0; i < b; i++)
            value *= a;
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(double_math(a, b));
    }
}