package business;

/**
 * Created by Alvaro on 2/17/2016.
 */
public class Employee extends Person {


    private String ssn;

    public void setSSN(String ssn){this.ssn = ssn;}

    public String getSSN(){return this.ssn;}

    public Employee () {

    }

    public String getDisplayText(){ return
            this.toString() + "\n" + "Social security number: " + this.getSSN();
    }
    

}
