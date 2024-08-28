import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        cnt = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            String d = sc.next();
            for(int j = 0; j < t; j++){
                if(d.equals("L")){
                    A.add(cnt);
                    cnt--;
                }else{
                    A.add(cnt);
                    cnt++;
                }
            }
        }
        cnt = 0;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            String d = sc.next();
            for(int j = 0; j < t; j++){
                if(d.equals("L")){
                    B.add(cnt);
                    cnt--;
                }else{
                    B.add(cnt);
                    cnt++;
                }
            }
        }
        cnt = 0;
        int min = Math.min(A.size(), B.size());
        for(int i = 1; i < min; i++){
            if(A.get(i) == B.get(i))
                cnt++;
        }
        System.out.print(cnt);
    }
}