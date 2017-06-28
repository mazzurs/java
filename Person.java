package sample;

public class Person {
    private String firstName;
    private String lastName;
    private int id;

    public Person (String firstName,String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName (){
        return firstName;
    }

    public String getLastName (){
        return lastName;
    }

    public int getId (){
        return id;
    }

    protected int changeId(){
    return changePersonId();
    }

    private int changePersonId(){
        return id+2;
    }
}
