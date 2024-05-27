import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 0;

        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                if(i % 2 == 0){
                    m++;
                }else{
                    m+=2;
                }
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}