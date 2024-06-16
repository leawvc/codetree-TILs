import java.util.Scanner;

public class Main {
    public static int discriminant(int y, int m, int d) {
        if(y % 4 == 0 && y % 100 != 0) {
            if(m == 4 || m == 6 || m == 9 || m == 11) {
                if(d < 31) {
                    return m;
                }
            } else if(m == 2) {
                if(d < 30) {
                    return m;
                }
            } else {
                if(d < 32) {
                    return m;
                }
            }
        } else {
            if(m == 4 || m == 6 || m == 9 || m == 11) {
                if(d < 31) {
                    return m;
                }
            } else if(m == 2) {
                if(d < 29) {
                    return m;
                }
            } else {
                if(d < 32) {
                    return m;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(discriminant(y, m , d) == -1) {
            System.out.print(-1);
        } else if(discriminant(y, m , d) <= 2 || discriminant(y, m , d) == 12) {
            System.out.print("Winter");
        } else if(discriminant(y, m , d) <= 5) {
            System.out.print("Spring");
        } else if(discriminant(y, m , d) <= 8) {
            System.out.print("Summer");
        } else {
            System.out.print("Fall");
        }
    }
}