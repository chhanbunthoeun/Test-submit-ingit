public class Student extends Person {
    int numCourses;
    String[] courses;
    int[] grades;
    int newCouse;


    public Student(String name, String address,int newCouse) {
        super(name, address);
        this.numCourses = 0;
        this.newCouse=newCouse;
        this.courses = new String[newCouse];
        this.grades = new int[newCouse];
    }

    // Method to add course and grade
    public void addCourseAndGrade(String course, int grade) {
        if (numCourses <newCouse) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        } else {
            System.out.println("Maximum number of courses reached.");
        }
    }

    // Method to print grades
    public void printGrades() {
        System.out.println("Grades for " + name + ":");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }
}
