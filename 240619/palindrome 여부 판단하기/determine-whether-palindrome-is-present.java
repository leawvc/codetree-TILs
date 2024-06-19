import java.util.Scanner;

public class Main {
    public static boolean modify(String s) {
        String s1 = "";
        for(int i = s.length() - 1; i >= 0; i--){
            s1 += s.charAt(i);
        }
        if(s1.equals(s))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(modify(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}