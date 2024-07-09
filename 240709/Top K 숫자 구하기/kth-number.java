import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer [] arr = new Integer[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        System.out.print(arr[k - 1]);
        /**
        입력 받은 단어들 정렬
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++)
            words[i] = sc.next();
        Arrays.sort(words);

        for(int i = 0; i < n; i++)
            System.out.println(words[i]);
        */
        
        /**
        한 글자 정렬
        String str = sc.next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr);
        */

        /**
        숫자 정렬
        int n = sc.nextInt();
        Integer[] arr = new Integer[n]; 
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        */
        
        /**
        숫자 역순 정렬
        Arrays.sort(arr);
        for(int i : arr)
            System.out.print(i + " ");
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i : arr)
            System.out.print(i + " ");
        */
    }
}