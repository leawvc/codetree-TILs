import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        a *= 10;
        System.out.print("0.");
        for(int i = 0; i < 20; i++){
            if(a > b)
                System.out.print(a / b);
            else
                System.out.print(a % b);
            a %= b;
        }
    }
}