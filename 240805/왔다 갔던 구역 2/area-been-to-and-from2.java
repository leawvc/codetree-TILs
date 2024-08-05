import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int offset = 2000;
        int n = sc.nextInt();
        int [] arr = new int [4001];
        
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            String b = sc.next();
            if(b.equals("L")){
                for(int j = 0; j < a; j++){
                    offset--;
                    arr[offset]++;
                }
            }
            else{
                for(int j = 0; j < a; j++){
                    offset++;
                    arr[offset]++;
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(2 <= arr[i])
                cnt++;
        }
        System.out.print(cnt);
    }
}