import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                for(int j = 1; j <= n; j++){
                    System.out.print(n * (i - 1) + j + " ");
                }
            }else{
                for(int j = 0; j < n; j++){
                    System.out.print(n * i - j + " ");
                }
            }
            System.out.println();
        }
    }
}