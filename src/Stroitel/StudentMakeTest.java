package Stroitel;

public class StudentMakeTest {
    public static void main(String[] args) {
     Student student = new Student.StudentMaker("Khamit", "Amantaev", 27,179).build();
     System.out.println(student);
    }
}
