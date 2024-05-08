public class Main {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(b);
        System.out.println(a);
    }
}