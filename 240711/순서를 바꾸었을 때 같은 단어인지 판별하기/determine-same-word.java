import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();

        char[] chars = str.toCharArray();
        char[] chars1 = str1.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        String sortedStr = new String(chars);
        String sortedStr1 = new String(chars1);
        
        if(sortedStr.equals(sortedStr1))
            System.out.print("Yes");
        else
            System.out.print("No");
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