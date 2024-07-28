import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();
        int sum = 0;
        for(int i = 0; i < binary.length(); i++)
            sum = sum * 2 + (binary.charAt(i) - '0');
        sum *= 17;
        int num = 0;
        int cnt = 1;
        while(sum > 0){
            num += sum % 2 * cnt;
            sum /= 2;
            cnt *= 10;
        }
        System.out.print(num);
    }
}