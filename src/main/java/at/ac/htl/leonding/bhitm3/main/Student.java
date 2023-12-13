package at.ac.htl.leonding.bhitm3.main;

public class Student extends Person {
    String studentID;

    private Teacher teacher;

    public void setTeacher (Teacher teacher){
        this.teacher = teacher;
    }

    public Object getTeacher (){
        return this.teacher;
    }

    public void setStudentID(String id) {
        this.studentID = id;
    }

    public Object getStudentID(){

        return this.studentID;
    
    }
}
