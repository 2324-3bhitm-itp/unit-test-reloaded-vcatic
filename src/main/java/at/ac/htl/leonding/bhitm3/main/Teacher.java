package at.ac.htl.leonding.bhitm3.main;

public class Teacher extends Person {
    int salary;
    int teacherId;
    private Subject subject;

    private void setTeacherId (int teacherId){
        this.teacherId = teacherId;
    }

    public int getTeacherId(){
        return this.teacherId;
    }
   
    public void setSalary(int salary) {
        this.salary = salary;
    }   

    public Object getSalary() {
        return this.salary;
    }
}