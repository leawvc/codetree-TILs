import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[40000];
        int b[] = new int[40000];
        int nValue = 0, mValue = 0, cnt = 0;
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int num = sc.nextInt();
            for(int j = 0; j < num; j++){
                if(s.equals("R")){
                    a[cnt] = nValue;
                    nValue++;
                }else{
                    a[cnt] = nValue;
                    nValue--;
                }
                cnt++;
            }
        }
        cnt = 0;
        int len = 0;
        for(int i = 0; i < m; i++){
            String s = sc.next();
            int num = sc.nextInt();
            for(int j = 0; j < num; j++){
                if(s.equals("R")){
                    b[cnt] = mValue;
                    mValue++;
                }else{
                    b[cnt] = mValue;
                    mValue--;
                }
                cnt++;
            }
            len = cnt;
        }
        for(int i = 1; i < len; i++){
            if(a[i] == b[i]){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}