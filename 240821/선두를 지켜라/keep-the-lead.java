import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int num = 0;
        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                num += v;
                a.add(num);
            }
        }
        num = 0;
        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                num += v;
                b.add(num);
            }
        }
        int cnt = 0, aIsLeading = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)){
                if(aIsLeading == 2)
                    cnt++;
                aIsLeading = 1;
            }
            else if(a.get(i) < b.get(i)){
                if(aIsLeading == 1)
                    cnt++;
                aIsLeading = 2;
            }
        }
        System.out.print(cnt);
    }
}