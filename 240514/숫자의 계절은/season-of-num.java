import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if(m <= 2 || m == 12)
            System.out.print("Winter");
        else if(3 <= m && m <= 5)
            System.out.print("Spring");
        else if(6 <= m && m <= 8)
            System.out.print("Summer");
        else
            System.out.print("Fall");
    }
}