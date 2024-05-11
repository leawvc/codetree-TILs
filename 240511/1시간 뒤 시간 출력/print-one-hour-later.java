import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":"); // : 기준으로 잘라서 입력 받겠다는 뜻
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(h + "\n" + m);
    }
}