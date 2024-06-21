import java.util.Scanner;

class Wrap{
    int value;

    public Wrap(int value){
        this.value = value;
    }    
}
public class Main {
    public static int n;

    public static void swap(Wrap n){
        if(n.value < 0){
            n.value *= -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            Wrap n = new Wrap(sc.nextInt());
            swap(n);
            System.out.print(n.value +" ");
        }
    }
}