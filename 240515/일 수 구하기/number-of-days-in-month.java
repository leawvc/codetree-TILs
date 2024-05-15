import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        if(n == 2)
            System.out.print(28);
        else if(n == 4 || n == 6 || n == 9 || n == 11)
            System.out.print(30);
        else
            System.out.print(31);

    }
}