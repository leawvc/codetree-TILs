import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        if(25 <= (10000 * w) / (h * h)){
            System.out.println((10000 * w) / (h * h));
            System.out.print("Obesity");
        }else{
            System.out.println((10000 * w) / (h * h));
        }
    }
}