import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(1.0 <= a && 1.0 <= b)
            System.out.print("High");
        else if(0.5 <= a && 0.5 <= b)
            System.out.print("Middle");
        else
            System.out.print("Low");
    }
}