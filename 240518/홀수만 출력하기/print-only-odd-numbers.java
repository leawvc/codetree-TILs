import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int j = sc.nextInt();
            if(j % 2 != 0 && j % 3 == 0){
                System.out.println(j);
            }
        }
    }
}