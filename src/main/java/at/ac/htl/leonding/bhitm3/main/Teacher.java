package at.ac.htl.leonding.bhitm3.main;

public class Teacher extends Person {
    int salary;
   
    public void setSalary(int salary) {
        this.salary = salary;
    }   

    public Object getSalary() {
        return this.salary;
    }
}