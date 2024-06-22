import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        int result = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(0) != A.charAt(i)){
                result = 1;
                break;
            }
        }
        if(result == 1)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}