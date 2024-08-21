import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] aDistances = new int[n + 1];
        int[] bDistances = new int[m + 1];

        // A의 누적 이동 거리 계산
        int currentADistance = 0;
        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            currentADistance += v * t;
            aDistances[i] = currentADistance;
        }

        // B의 누적 이동 거리 계산
        int currentBDistance = 0;
        for (int i = 1; i <= m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            currentBDistance += v * t;
            bDistances[i] = currentBDistance;
        }

        int leaderChanges = 0;
        boolean aIsLeading = aDistances[0] >= bDistances[0];

        // 선두 변경 감지
        for (int i = 1; i <= Math.min(n, m); i++) {
            boolean isALeadingNow = aDistances[i] > bDistances[i];
            boolean isBLeadingNow = bDistances[i] > aDistances[i];

            // 선두가 바뀌는 경우
            if (aIsLeading && isBLeadingNow) {
                leaderChanges++;
                aIsLeading = false; // B가 선두가 됨
            } else if (!aIsLeading && isALeadingNow) {
                leaderChanges++;
                aIsLeading = true; // A가 선두가 됨
            }
        }

        System.out.println(leaderChanges);
    }
}