package S8.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return (grade1 + grade2 + grade3) / 3;
    }
}
