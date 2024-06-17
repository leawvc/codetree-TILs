import java.util.Scanner;

class Resion{

    String name, bun, place;

    public Resion(String name, String bun, String place){
        this.name = name;
        this.bun = bun;
        this.place = place;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Resion [] resions = new Resion[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            String bun = sc.next();
            String place = sc.next();

            resions[i] = new Resion(name, bun, place);
        }

        int min = 0;
        for(int i = 1; i < n; i++){
            if(resions[i].name.compareTo(resions[min].name) > 0)
                min = i;
        }
        System.out.println("name " + resions[min].name);
        System.out.println("addr " + resions[min].bun);
        System.out.println("city " + resions[min].place);
    }
}