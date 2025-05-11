package Student_Course;

public class StudentCoursesApp {
    public static void main(String[] args) {

        Course course1=new Course("SE1020","OOP");
        Course course2=new Course("SE1030","DSA");
        Course course3=new Course("SE1040","DM");

        Student student=new Student("ST001","Chamal");

        student.enrollCourse(course1);
        student.enrollCourse(course2);
        student.enrollCourse(course3);

        student.displayStudentDetails();

    }
}
