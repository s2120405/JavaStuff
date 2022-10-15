package Inheritance2;

public class Main extends Teacher{
    protected Main() {
        super("A","B","C");
    }
    public static void main(String[] args) {
        Teacher obj = new Teacher("Teacher", "CET", "Programming");


        College CollName = new College();
        System.out.println(obj.collegeName);
        obj.does1();
        System.out.println(obj.getDesignation());
        obj.setDesignation("Lecturer");
        obj.does2();
        System.out.println(obj.getDesignation());
        obj.does3();
        System.out.println(obj.getSubjectName());
        obj.does4();
        CollName.CollegeCode();
        obj.does5();
        CollName.CollegeSubj();
        System.out.println(obj.getSubjectName());
        obj.does();


    }
}