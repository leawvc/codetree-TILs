import java.util.Scanner;

public class Main {
    public static boolean onjeon(int []arr, int []arr1){
        int cnt = 0;
        for(int i = 0; i < arr.length -1; i++){
            if(arr[i] == arr1[0]){
                break;
            }
            cnt++;
        }
        for(int i = 0; i < arr.length - arr1.length; i++){
            if(arr[cnt + i] != arr1[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int [] arr = new int [a];
        int [] arr1 = new int [b];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++){
            arr1[i] = sc.nextInt();
        }
        if(arr.length >= arr1.length){
            if(onjeon(arr, arr1))
                System.out.print("Yes");
            else
                System.out.print("No");
        }else{
            if(onjeon(arr1, arr))
                System.out.print("Yes");
            else
                System.out.print("No");
        }
    }
}