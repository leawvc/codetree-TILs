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
        int cnt = 0;
        boolean aIsLeading = true;
        for(int i = 0; i < a.size(); i++){
            if(aIsLeading == true && a.get(i) - b.get(i) < 0){
                cnt++;
                aIsLeading = false;
            }
            else if(aIsLeading == false && a.get(i) - b.get(i) > 0){
                cnt++;
                aIsLeading = true;
            }
        }
        if(cnt != 0)
            System.out.print(cnt);
        else
            System.out.print(-1);
    }
}