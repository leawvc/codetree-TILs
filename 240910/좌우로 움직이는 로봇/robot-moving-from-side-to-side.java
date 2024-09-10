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
            String t = sc.next();
            for(int j = 0; j < v; j++){
                if(t.equals("L"))
                    num--;
                else
                    num++;
                a.add(num);
            }
        }
        num = 0;
        for(int i = 0; i < m; i++){
            int v = sc.nextInt();
            String t = sc.next();
            for(int j = 0; j < v; j++){
                if(t.equals("L"))
                    num--;
                else
                    num++;
                b.add(num);
            }
        }
        int cnt = 0;
        int len = Math.min(a.size(), b.size());
        for(int i = 1; i < len; i++){
            if(a.get(i - 1) != b.get(i - 1) && a.get(i).equals(b.get(i)))
                cnt++;
        }
        if(a.size() != b.size()){
            if(a.size() > b.size()){
                for(int i = len; i < a.size(); i++){
                    if(b.get(len - 1).equals(a.get(i)))
                        cnt++;
                }
            }
            else{
                for(int i = len; i < b.size(); i++){
                    if(a.get(len - 1).equals(b.get(i)))
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}