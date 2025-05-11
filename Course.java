package Student_Course;

public class Course {
    private String courseCode;
    private String courseTitle;

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }
    public void displayCourseDetails() {
        System.out.println("Course Code: "+courseCode);
        System.out.println("Course Title: "+courseTitle);
    }
}
