import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max_value = -999;
        int min_value = 999;
        int [] arr = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999)
                break;
            if(max_value < arr[i])
                max_value = arr[i];
            if(min_value > arr[i])
                min_value = arr[i];
        }
        System.out.print(max_value + " " + min_value);
    }
}