import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];

        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }
        int start = 0, cnt = 0;
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
            if(arr1[i] == arr2[0])
                break;
            start++;     
        }
        for(int i = start; i < arr1.length; i++){
            if(arr1[start] != arr2[i - start])
                break;
            cnt++;
        }
        if(cnt == arr2.length)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}