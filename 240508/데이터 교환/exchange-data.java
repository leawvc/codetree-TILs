public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp, temp1;

        temp = b;
        temp1 = c;
        b = a;
        c = temp;
        a = temp1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}