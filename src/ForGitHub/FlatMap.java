package ForGitHub;

import java.util.ArrayList;
import java.util.List;


public class FlatMap {
    public static void main(String[] args) {

        Student st1 = new Student("iVAN", 'm', 22, 3, 8.3);
        Student st2 = new Student("Vadim", 'm', 28, 1, 5.3);
        Student st3 = new Student("Irina", 'f', 25, 5, 3.8);
        Student st4 = new Student("Luba", 'f', 39, 4, 9.3);
        Student st5 = new Student("Petr", 'm', 18, 1, 5.8);
        Student st6 = new Student("Katay", 'm', 52, 2, 6.8);



        Faculty f1 = new Faculty("Ecomics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFactulty(st1);
        f1.addStudentToFactulty(st2);
        f1.addStudentToFactulty(st3);
        f2.addStudentToFactulty(st4);
        f2.addStudentToFactulty(st5);
        f2.addStudentToFactulty(st6);

        List<Faculty> fuc = new ArrayList<>();
        fuc.add(f1);
        fuc.add(f2);
        fuc.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(el -> System.out.println(el.getName()));
    }
}

class Faculty{

    String name;
    List<Student> studentsOnFaculty;


    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public  void addStudentToFactulty(Student st){
        studentsOnFaculty.add(st);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
