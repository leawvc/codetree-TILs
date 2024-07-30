import java.util.Scanner;
public class Main {
    public static int [] cloud;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        cloud = new int [n];
        for(int i = 0; i < k; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a - 1; j <= b - 1; j++){
                cloud[j] += 1;
            }
        }
        int max = cloud[0];
        for(int i : cloud){
            if(i > max)
                max = i;
        }
        System.out.print(max);
    }
}