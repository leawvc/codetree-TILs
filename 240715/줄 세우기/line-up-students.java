import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable<Student>{
    int  height, weight, num;

    public Student(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo(Student student) {
    if (this.height != student.height) {
        return student.height - this.height; // 키가 큰 순서대로
    } else if (this.weight != student.weight) {
        return student.weight - this.weight; // 몸무게가 더 무거운 순서대로
    } else {
        return this.num - student.num; // 숫자가 더 작은 순서대로
    }
}

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student [] Students = new Student[n];
        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();

            Students[i] = new Student(height, weight, i + 1);
        }
        Arrays.sort(Students);

        for(int i = 0; i < n; i++){
            System.out.print(Students[i].height + " ");
            System.out.print(Students[i].weight + " ");
            System.out.println(Students[i].num);
        }
    }
}