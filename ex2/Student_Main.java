package ex2;

public class Student_Main {
    public static boolean isPassed(Student student){
        return student.getGpa() >= 5.0;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Nguyen Ngoc Vu ", 9.0);
        Student s2 = new Student("Nguyen Van Hai ", 4.0);
        System.out.println("Sinh vien " + s1.getName() + (isPassed(s1) ? "do." : "truot."));
        System.out.println("Sinh vien " + s2.getName() + (isPassed(s2) ? "do." : "truot."));
    }
}
