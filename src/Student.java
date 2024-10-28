import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public Student() {
        this.name = "";
        this.grades = new int[0];
    }

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }


    public void copyGrades(Student otherStudent) {
        this.grades = Arrays.copyOf(otherStudent.getGrades(), otherStudent.getGrades().length);
    }

    public String toString() {
        return "Имя: " + name + ", Оценки: " + Arrays.toString(grades);
    }
}

