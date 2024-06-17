import java.util.Scanner;

class Bomb{
    
    String code;
    char color;
    int seconds;

    public Bomb(){
        this.code = "0";
        this.color = 0;
        this.seconds = 0;
    }

    public Bomb(String code, char color, int seconds){
        this.code = code;
        this.color = color;
        this.seconds = seconds;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bomb[] Bombs = new Bomb[1];
        String code = sc.next();
        char color = sc.next().charAt(0);
        int seconds = sc.nextInt();
        Bombs[0] = new Bomb(code, color, seconds);

        System.out.printf("code : %s\n",Bombs[0].code);
        System.out.printf("color : %s\n",Bombs[0].color);
        System.out.printf("second : %s\n",Bombs[0].seconds);
    }
}