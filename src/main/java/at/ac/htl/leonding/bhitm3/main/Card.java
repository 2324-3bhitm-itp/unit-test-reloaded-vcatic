package at.ac.htl.leonding.bhitm3.main;

public class Card {
    
    private Subject subject;
    private int id;


    private void setId (int id){
        this.id = id;
    }

    public int getId (){
        return this.id;
    }

    private void setSubject (Subject subject){
        this.subject = subject;
    }

    public Subject getSubject(){
        return this.subject;
    }


}
