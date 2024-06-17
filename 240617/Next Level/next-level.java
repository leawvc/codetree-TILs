import java.util.Scanner;

class user{
    String id, level;
    public user(String id, String level){
        this.id = id;
        this.level = level;
    }
    public user(){
        this.id = "codetree";
        this.level = "10";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        user tr = new user();
        System.out.printf("user %s lv %s\n", tr.id, tr.level);

        String [] str = sc.nextLine().split(" ");
        user tr1 = new user(str[0], str[1]);

        System.out.printf("user %s lv %s", tr1.id, tr1.level);
    }
}