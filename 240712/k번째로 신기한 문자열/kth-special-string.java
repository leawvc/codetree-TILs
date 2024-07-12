import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String [] str = new String[n];

        for(int i = 0; i < n; i++)
            str[i] = sc.next();

        cnt = 0;
        for(String s : str)
            if(s.startsWith(T))
                cnt++;
        String [] str1 = new String[cnt];

        cnt = 0;
        for(String s : str)
            if(s.startsWith(T)){
                str1[cnt] = s;
                cnt++;
            }
        Arrays.sort(str1);

        System.out.print(str1[k - 1]);
    }
}