import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        String str = sc.next();
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr);
        // Integer[] arr = new Integer[n]; 
        // Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Arrays.sort(arr2, Collections.reverseOrder());
        // for(int i = 0; i < n; i++)
        //     arr[i] = sc.nextInt();
        
        // Arrays.sort(arr);
        // for(int i : arr)
        //     System.out.print(i + " ");
        // System.out.println();
        // Arrays.sort(arr,Collections.reverseOrder());
        // for(int i : arr)
        //     System.out.print(i + " ");
    }
}