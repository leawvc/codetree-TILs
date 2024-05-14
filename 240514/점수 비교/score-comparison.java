import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A_Math = sc.nextInt();
        int A_English = sc.nextInt();
        int B_Math = sc.nextInt();
        int B_English = sc.nextInt();

        if(A_Math > B_Math && A_English > B_English)
            System.out.println(1);
        else
            System.out.println(0);
    }
}