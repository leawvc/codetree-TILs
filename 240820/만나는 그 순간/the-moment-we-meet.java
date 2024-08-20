import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int nValue = 0, mValue = 0;
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int num = sc.nextInt();
            for(int j = 0; j < num; j++){
                a.add(nValue);
                if(s.equals("R"))
                    nValue++;
                else
                    nValue--;
            }
        }
        for(int i = 0; i < m; i++){
            String s = sc.next();
            int num = sc.nextInt();
            for(int j = 0; j < num; j++){
                b.add(mValue);
                if(s.equals("R"))
                    mValue++;
                else
                    mValue--;
            }
        }
        int len = Math.min(a.size(), b.size());
        for(int i = 1; i < len; i++){
            if(a.get(i).equals(b.get(i))){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}