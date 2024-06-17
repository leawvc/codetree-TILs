import java.util.Scanner;

class tree{
    String code, alpha, length;
    public tree(String code, String alpha, String length){
        this.code = code;
        this.alpha = alpha;
        this.length = length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] str = sc.nextLine().split(" ");
        tree tr = new tree(str[0], str[1], str[2]);

        System.out.printf("secret code : %s\n", tr.code);
        System.out.printf("meeting point : %s\n", tr.alpha);
        System.out.printf("time : %s", tr.length);
    }
}