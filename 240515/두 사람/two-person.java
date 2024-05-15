import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String a_gen = sc.next();
        
        int b = sc.nextInt();
        String b_gen = sc.next();

        if((a >= 19 && a_gen.equals("M")) ||(b >= 19 && b_gen.equals("M")))
            System.out.print(1);
        else
            System.out.print(0);
    }
}