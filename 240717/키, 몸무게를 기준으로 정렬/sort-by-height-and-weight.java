import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    String name;
    int  height, weight;

    public Student(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student) {
        if(this.height == student.height)
            return student.weight - this.weight;
        return this.height - student.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student [] Students = new Student[n];
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            Students[i] = new Student(name, height, weight);
        }
        Arrays.sort(Students);

        for(int i = 0; i < n; i++)
            System.out.printf("%s %d %d \n", Students[i].name, Students[i].height, Students[i].weight);
    }
}