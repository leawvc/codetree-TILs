import java.util.Scanner;

class Wrap{
    int value;

    public Wrap(int value){
        this.value = value;
    }    
}
public class Main {
    public static int a, b;

    public static void swap(Wrap n, Wrap m){
        if(n.value < m.value){
            n.value *= 2;
            m.value += 25;
        }else{
            n.value += 25;
            m.value *= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();

        Wrap n = new Wrap(a);
        Wrap m = new Wrap(b);

        swap(n, m);
        a = n.value;
        b = m.value;
        System.out.print(a + " " + b);
    }
}