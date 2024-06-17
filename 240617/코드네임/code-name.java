import java.util.Scanner;

class CodeName {
    char code;
    int point;

    public CodeName() {
        this.code = 0;
        this.point = 0;
    }

    public CodeName(char code, int point){
        this.code = code;
        this.point = point;
    }
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        CodeName[] CodeNames = new CodeName[5];
        int min;
        int max = 100;
        for(int i = 0; i < 5; i++) {
            char code = sc.next().charAt(0);
            int point = sc.nextInt();
            if(point <= max){
                max = point;
                min = i;
            }
            CodeNames[i] = new CodeName(code, point);
        }

        CodeName CodeName3 = CodeNames[min];
        System.out.print(CodeName3.code + " " + CodeName3.point);
    }
}