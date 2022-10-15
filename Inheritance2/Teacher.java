package Inheritance2;

public class Teacher extends Subject {
    //fields of parent class
    private String designation;
    String collegeName;
    String subjectName;
    String strAction;
    Subject subObj = new Subject();

    public Teacher(String designation, String collegeName, String subjectName) {
        super();

        this.designation = designation;
        this.collegeName = collegeName;
        subObj.setSubject(subjectName);
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public String getSubjectName() {
        return subObj.subject;
    }

    //method of parent class
    void does(){
        System.out.println("Teaching");
    }

    void does1(){
        System.out.println("Delegates");
    }

    void does2(){
        System.out.println("is also a");
    }

    void does3(){
        System.out.println("Teaches");
    }

    void does4(){
        System.out.println("is a topic in");
    }

    void does5(){
        System.out.println("is the class code of");
    }
    //overloading
    private void does(String strAction){
        this.strAction = strAction;
        System.out.println("Teaching - " + strAction);
    }
}

