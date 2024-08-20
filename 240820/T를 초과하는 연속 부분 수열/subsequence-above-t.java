import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 수열의 길이
        int t = sc.nextInt();  // 기준 값
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // 수열 입력
        }

        int maxLen = 0;  // 최대 길이
        int currentLen = 0;  // 현재 연속 부분 수열의 길이

        for(int i = 0; i < n; i++) {
            if(arr[i] > t) {
                currentLen++;  // t보다 크면 길이 증가
            } else {
                // t보다 크지 않으면 최대 길이 갱신 후, 길이 초기화
                if(currentLen > maxLen) {
                    maxLen = currentLen;
                }
                currentLen = 0;
            }
        }

        // 마지막 구간을 처리
        if(currentLen > maxLen) {
            maxLen = currentLen;
        }

        System.out.println(maxLen);  // 최대 길이 출력
    }
}