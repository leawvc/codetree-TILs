import java.util.Scanner;

public class Main {

    public static int M;
    public static int D;

    public static boolean isValidDate(int M,int D){
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        if(12 < M)
            return false;
        if(daysInMonth[M - 1] < D)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        D = sc.nextInt();

        if(isValidDate(M, D))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}