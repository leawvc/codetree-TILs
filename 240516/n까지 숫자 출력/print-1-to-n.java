import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int i = 1;

        a = sc.nextInt();

        while(i <= a){
            System.out.print(i +" ");
            i++;
        }
    }
}