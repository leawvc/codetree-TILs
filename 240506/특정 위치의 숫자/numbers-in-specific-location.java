import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수열 입력 받기
        String input = sc.nextLine();
        String[] numbers = input.split(" ");

        int answer = 0;
        answer += Integer.parseInt(numbers[2]) +Integer.parseInt(numbers[4]) + Integer.parseInt(numbers[9]);
        System.out.print(answer);
        // 여기에 코드를 작성해주세요.
    }
}