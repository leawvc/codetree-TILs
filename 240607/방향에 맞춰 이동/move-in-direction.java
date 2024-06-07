import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dx = 0, dy = 0;
        for(int i = 0; i < n; i++){
            char c = sc.next().charAt(0);
            int j = sc.nextInt();
            if(c == 'W')
                dx -= j;
            else if(c == 'S')
                dy -= j;
            else if(c == 'N')
                dy += j;
            else
                dx += j;
        }
        System.out.print(dx + " " + dy);
    }
}