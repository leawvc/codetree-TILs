import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, cnt = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        if(a <= b){
            for(int i = a; i <= b; i++){
                if(i % 5 == 0)
                    cnt += i;
            }
        }else{
            for(int i = b; i <= a; i++){
                if(i % 5 == 0)
                    cnt += i;
            }
        }
        System.out.print(cnt);
    }
}