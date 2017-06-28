package sample;

public class Developer extends Person {
    public Developer(String firstName,String lastName, int id){
        super(firstName, lastName, id);
    }

    public void develop (String task){
        System.out.println("I'm doing the task:" + task + "now!");
    }

    @Override
    protected int changeId(){
        return getId()+ 3;
    }
}


