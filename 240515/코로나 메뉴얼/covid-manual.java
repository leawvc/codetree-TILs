import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        char a_t, b_t, c_t;
        

        a_t = sc.next().charAt(0);
        a = sc.nextInt();

        b_t = sc.next().charAt(0);
        b = sc.nextInt();

        c_t = sc.next().charAt(0);
        c = sc.nextInt();
        
        if(a_t == 'Y' && a >= 37) {
            if((b_t == 'Y' && b >= 37) || (c_t == 'Y' && c >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
        else {
            if((c_t == 'Y' && c >= 37) && (b_t == 'Y' && b >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
    }
}