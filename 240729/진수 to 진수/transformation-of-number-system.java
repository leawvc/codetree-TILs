import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int sum = 0;
        for(int i = 0; i < n.length(); i++)
            sum = sum * a + (n.charAt(i) - '0');
        int cnt = 1;
        int num = 0;
        while(sum > 0){
            num += sum % b * cnt;
            sum /= b;
            cnt *= 10;
        }
        System.out.print(num);
    }
}