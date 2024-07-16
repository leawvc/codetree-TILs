import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student>{
    String name;
    int height;
    double weight;

    public Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student [] Students = new Student[5];

        for(int i = 0; i < 5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            Students[i] = new Student(name, height, weight);
        }
        Arrays.sort(Students);
        System.out.println("name");
        for(int i = 0; i < 5; i++)
            System.out.printf("%s %d %.1f\n",Students[i].name ,Students[i].height, Students[i].weight);
        System.out.println();
        System.out.println("height");
        // custom comparator를 활용한 정렬
        Arrays.sort(Students, new Comparator<Student>() {  
            @Override
            public int compare(Student a, Student b) { // 키를 기준 오름차순 정렬합니다.
                return (int)(b.height - a.height);
            }
        });
        for(int i = 0; i < 5; i++)
            System.out.printf("%s %d %.1f\n",Students[i].name ,Students[i].height, Students[i].weight);
    }
}