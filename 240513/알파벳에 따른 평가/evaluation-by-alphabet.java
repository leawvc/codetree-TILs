import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();

        if (c.equals("S")) {
            System.out.println("Superior");
        }
        else if (c.equals("A")) {
            System.out.println("Excellent");
        }
        else if (c.equals("B")) {
            System.out.println("Good");
        }
        else if (c.equals("C")) {
            System.out.println("Usually");
        } 
        else if (c.equals("D")) {
            System.out.println("Effort");
        }
        else{
            System.out.println("Failure");
        }
    }
}