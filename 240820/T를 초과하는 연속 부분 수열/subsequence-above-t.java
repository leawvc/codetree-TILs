import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int maxLen = 0, currentLen = 0;
        for(int i : arr){
            if(i > t)
                currentLen++;
            else{
                if(currentLen > maxLen)
                    maxLen = currentLen;
                currentLen = 0;
            }
        }
        System.out.println(maxLen);
    }
}