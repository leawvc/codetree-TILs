import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 2진수 문자열로 받기
        String binaryInput = sc.next();
        int n = Integer.parseInt(binaryInput, 2);  // 2진수를 10진수로 변환

        // sum 계산하기
        int sum = n * 17;

        // sum을 2진수 문자열로 변환
        String binaryOutput = Integer.toBinaryString(sum);

        // 결과 출력
        System.out.print(binaryOutput);
    }
}