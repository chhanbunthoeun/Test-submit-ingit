
public class Main {
    public static void main(String[] args) {
    Student obj=new Student("sovial","Phnom Penh",5);
        try{
            obj.addCourseAndGrade("Java",100);
            obj.addCourseAndGrade("Javascript",89);
            obj.addCourseAndGrade("JQuery",78);
            obj.addCourseAndGrade("Html",98);
            obj.addCourseAndGrade("css",79);
            obj.addCourseAndGrade("PHP",90);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error"+e.getMessage());
        }
        System.out.println("\n====================================");
        obj.printGrades();
    }
}