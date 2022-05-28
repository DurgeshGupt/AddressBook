package addressbook;

public class Person {
    private String name;
    private String lastName;
    private int phoneNumber;
    private String emailId;
    private String state;
    private String city;

    Person(String name, String lastName, int phoneNumber, String emailId, String state, String city ){
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.state = state;
        this.city = city;

    }

    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getState(){
        return state;
    }
    public String getEmailId(){
        return emailId;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public String getCity(){
        return city;
    }
    public String toString(){
        return name+ " "+lastName+" "+state+ " "+emailId+" "+phoneNumber+" "+city+" ";
    }




}


