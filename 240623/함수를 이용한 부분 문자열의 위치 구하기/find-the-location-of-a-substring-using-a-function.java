import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str1 = sc.next();

        int len = str.length();
        int len1 = str1.length();
        int start = -1;

        for (int i = 0; i <= len - len1; i++) {
            boolean match = true;
            for (int j = 0; j < len1; j++) {
                if (str.charAt(i + j) != str1.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                start = i;
                break;
            }
        }

        System.out.print(start);
    }
}