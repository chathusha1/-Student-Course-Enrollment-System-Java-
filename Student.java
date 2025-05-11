package Student_Course;

public class Student {
    private String studentID;
    private String studentName;
    private Course[] courses=new Course[3];
    private int courseCount=0;

    public Student(){
    }
    public Student(String studentID, String studentName) {
        this.studentID=studentID;
        this.studentName=studentName;
    }
    public void enrollCourse(Course course){
        if(courseCount<3){
            courses[courseCount]=course;
            courseCount++;
            System.out.println("Course enrolled successfully!");
        }else {
            System.out.println("Cannot enroll more courses. Maximum limit reached!");
        }
    }
    public void displayStudentDetails() {
        System.out.println("\n----Student Details----");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Enrolled Courses: ");

        for(int i=0;i<courseCount;i++){
            System.out.println("\nCourse "+(i+1)+": ");
            courses[i].displayCourseDetails();
        }
    }

}
