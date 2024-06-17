import java.util.Scanner;

class Bomb{
    
    String name;
    int code;

    public Bomb(){
        this.name = "codetree";
        this.code = 50;
    }

    public Bomb(String name, int code){
        this.name = name;
        this.code = code;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bomb[] Bombs = new Bomb[1];
        String name = sc.next();
        int code = sc.nextInt();
        Bombs[0] = new Bomb(name, code);
        Bomb Bomb1 = new Bomb();

        System.out.printf("product %d is %s\n",Bomb1.code , Bomb1.name);
        System.out.printf("product %d is %s",Bombs[0].code, Bombs[0].name);
    }
}