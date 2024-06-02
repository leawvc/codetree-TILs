import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[4];

        for (int i = 0; i < 3; i++) {
            char m = sc.next().charAt(0);
            int n = sc.nextInt();
            if(m == 'Y' && n >= 37)
                countArr[0]++;
            else if(m != 'Y' && n >= 37)
                countArr[1]++;
            else if(m == 'Y')
                countArr[2]++;
            else
                countArr[3]++;
        }
        for(int i = 0; i < 4; i++)
            System.out.print(countArr[i] + " ");
        if(countArr[0] >= 2)
            System.out.print("E ");
    }
}