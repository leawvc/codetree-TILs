import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 로봇 A의 움직임 수
        int m = sc.nextInt();  // 로봇 B의 움직임 수

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        // 로봇 A의 초기 위치를 0으로 설정
        a.add(0);
        int num = 0;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();  // 몇 번 움직이는지
            String t = sc.next();  // 어느 방향으로 움직이는지
            for (int j = 0; j < v; j++) {
                if (t.equals("L"))
                    num--;  // 왼쪽으로 이동
                else
                    num++;  // 오른쪽으로 이동
                a.add(num);  // 새로운 위치 추가
            }
        }

        // 로봇 B의 초기 위치를 0으로 설정
        b.add(0);
        num = 0;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            String t = sc.next();
            for (int j = 0; j < v; j++) {
                if (t.equals("L"))
                    num--;
                else
                    num++;
                b.add(num);
            }
        }

        // 두 로봇이 직전 위치에서 다르다가 이번에 같은 위치에 오게 된 경우 카운트
        int cnt = 0;
        int len = Math.min(a.size(), b.size());

        // 마지막으로 카운트된 위치를 추적하는 변수
        Integer lastCountedPosition = null;

        // 직전 위치와 현재 위치가 다르면서 같은 위치에 도달한 경우 카운트
        for (int i = 1; i < len; i++) {
            if (!a.get(i - 1).equals(b.get(i - 1)) && a.get(i).equals(b.get(i))) {
                // 마지막으로 카운트된 위치와 현재 위치가 다를 때만 카운트
                if (lastCountedPosition == null || !a.get(i).equals(lastCountedPosition)) {
                    cnt++;
                    lastCountedPosition = a.get(i);  // 마지막으로 카운트된 위치 업데이트
                }
            }
        }

        // 더 긴 경로가 남은 경우 처리 (추가로 긴 쪽의 경로 끝까지 짧은 쪽의 마지막 위치와 비교)
        if (a.size() > b.size()) {
            for (int i = len; i < a.size(); i++) {
                if (a.get(i).equals(b.get(b.size() - 1))) {
                    if (lastCountedPosition == null || !a.get(i).equals(lastCountedPosition)) {
                        cnt++;
                        lastCountedPosition = a.get(i);
                    }
                }
            }
        } else if (b.size() > a.size()) {
            for (int i = len; i < b.size(); i++) {
                if (b.get(i).equals(a.get(a.size() - 1))) {
                    if (lastCountedPosition == null || !b.get(i).equals(lastCountedPosition)) {
                        cnt++;
                        lastCountedPosition = b.get(i);
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}