import java.util.Scanner;
 
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();

        int len = str.length();
        int len1 = str1.length();
        int start = 0;
        for(int i = 0; i <= len - len1; i++){
            start = -1;
            if(str.charAt(i) == str1.charAt(0)){
                start = i;
                int cnt = 0;
                for(int j = 0; j < len1; j++){
                    if(str.charAt(j + i) == str1.charAt(j)){
                        cnt++;
                    }
                }
                if(cnt == len1)
                    break;
            }
        }
        if(start == -1)
            System.out.print(-1);
        else
            System.out.print(start);
    }
}