import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[4001]; // 2000 ~ -2000 (총 4001 크기)
        int offset = 2000; // 배열의 중간을 2000으로 설정

        // 현재 위치
        int cur = offset;

        for (int i = 0; i < n; i++) {
            int distance = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("L")) {
                // 왼쪽으로 이동
                for (int j = 0; j < distance; j++) {
                    arr[cur]++; // 현재 위치의 방문 횟수 증가
                    cur--; // 위치 이동
                }
            } else {
                // 오른쪽으로 이동
                for (int j = 0; j < distance; j++) {
                    arr[cur]++; // 현재 위치의 방문 횟수 증가
                    cur++; // 위치 이동
                }
            }
        }

        // 2번 이상 지나간 영역의 크기를 계산
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}