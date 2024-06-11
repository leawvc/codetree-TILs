import java.util.Scanner;

public class Main {
    public static int sum(int a, int b, int c) {
        if(a <= b){
            if(c <= a)
                return c;
            else
                return a;
        }
        else if(a <= c){
            if(b <= a)
                return b;
            else
                return a;
        }else{
            if(b <= c)
                return b;
            else    
                return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(sum(a,b,c));
    }
}