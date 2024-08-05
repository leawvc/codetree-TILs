import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[4001]; // 배열 크기: -2000 ~ 2000을 표현하기 위한 크기
        int currentPosition = 2000; // 배열의 중앙을 현재 위치 0으로 설정

        // 명령어를 읽어 이동 경로를 기록합니다.
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("L")) {
                for (int j = 0; j < a; j++) {
                    currentPosition--;
                    arr[currentPosition]++;
                }
            } else {
                for (int j = 0; j < a; j++) {
                    currentPosition++;
                    arr[currentPosition]++;
                }
            }
        }

        // 2번 이상 지나간 구간의 개수를 계산합니다.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}