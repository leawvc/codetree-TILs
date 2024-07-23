import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] month = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int day1 = d1;
        int day2 = d2;
        for(int i = 0; i < m1; i++)
            day1 += num_of_days[i];
        for(int i = 0; i < m2; i++)
            day2 += num_of_days[i];

        int value = day2 - day1;
        int day = (value % 7 + 7) % 7;

        System.out.print(month[day]); 
        
    }
}