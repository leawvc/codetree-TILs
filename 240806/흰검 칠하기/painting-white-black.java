import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[4001];
        String [] str = new String[4001];
        int offset = 2000;
        for (int i = 0; i < str.length; i++) {
            str[i] = "";
        }
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();

            if (b.equals("L")) {
                if (a == 1){
                    arr[offset]++;
                    str[offset] = "white";
                } else{
                    for (int j = 0; j < a; j++) {
                        offset--;
                        arr[offset]++;
                        str[offset] = "white";
                    }
                }
            } else {
                if (a == 1){
                    arr[offset]++;
                    str[offset] = "black";
                } else{
                    for (int j = 0; j < a; j++) {
                        arr[offset]++;
                        str[offset] = "black";
                        offset++;
                    }
                    offset--;
                }
            }
        }
        int white = 0;
        int black = 0;
        int gray = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 4)
                gray++;
            else if(str[i].equals("white"))
                white++;
            else if(str[i].equals("black"))
                black++;
        }
        System.out.print(white + " " + black + " " + gray);
    }
}