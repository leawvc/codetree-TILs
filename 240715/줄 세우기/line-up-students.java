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
    public int compareTo(Student student){
        if(this.height > student.height)
            return student.height - this.height;
        else if(this.height == student.height){
            if(this.weight > student.weight)
                return student.weight - this.weight;
            else if(this.weight == student.weight)
                return student.num - this.num;
            else
                return this.weight - student.weight;
        }else
            return this.height - student.height;
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