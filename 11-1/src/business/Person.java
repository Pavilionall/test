package business;

/**
 * Created by Alvaro on 2/17/2016.
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setEmailAddress(String emailAddress){this.emailAddress = emailAddress;}

    public String getFirstName(){return this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getEmailAddress(){return this.emailAddress;}

    public Person () {

    }

    @Override
    public String toString(){return
            "Name: " + this.getFirstName() + " " + this.getLastName() + "\n" +
            "Email: " + this.getEmailAddress();
    }

    public abstract String getDisplayText();

}
