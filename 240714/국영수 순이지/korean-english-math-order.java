import java.util.Scanner;
import java.util.Arrays;
// import java.util.Comparator;

class Student implements Comparable<Student>{
    String name;
    int kor, eng, math;
    
    Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        if (this.kor != student.kor) {
            return student.kor - this.kor;
        } else if (this.eng != student.eng) {
            return student.eng - this.eng;
        } else {
            return student.math - this.math;
        }
    }
    // @Override
    // public int compareTo(Student student){
    //     if(this.kor == student.kor){
    //         if(this.eng == student.eng)
    //             return this.math - student.math;
    //         else if(this.math == student.math)
    //             return this.eng - student.eng;
    //     }else {
    //         if(this.eng == student.eng)
    //             return this.math - student.math;
    //         else
    //             return this.eng - student.eng;
    //     }
    //     return this.kor - student.kor;
    // }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        Student [] students = new Student[n];

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            
            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);
        for(int i = 0; i < n; i++){
            System.out.print(students[i].name + " ");
            System.out.print(students[i].kor + " ");
            System.out.print(students[i].eng + " ");
            System.out.println(students[i].math);
        }
    }
}