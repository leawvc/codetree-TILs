import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();

        for(int i = 1; i<= a; i++){
            if(i % 7 < 4){
                continue;
            }if((i / 8) % 2 == 0){
                continue;
            }if(i % 2 == 0 & i % 4 != 0){
                continue;   
            }else
                System.out.printf("%d ", i);
        }
    }
}