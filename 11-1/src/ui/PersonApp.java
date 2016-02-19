package ui;
import business.Person;
import business.Customer;
import business.Employee;

/**
 * Created by Alvaro on 2/17/2016.
 */
public class PersonApp {

    public static void main(String[] args) {
        String choice = "y";

        // creates console for use in input
        Console c = new Console();

        //Prints initial information and asks for input
        System.out.println("Welcome to the Person Tester Application");


        while (choice.equalsIgnoreCase("y")) {
            //Get response from user
            String ce = c.getString("\nCreate customer or employee? (c/e): ");
            System.out.println("");

            if (ce.equals("c")){
                Customer currentCust = new Customer();

                currentCust.setFirstName(c.getString("Enter first name: "));
                currentCust.setLastName(c.getString("Enter last name: "));
                currentCust.setEmailAddress(c.getString("Enter email address: "));
                currentCust.setCustomerNumber(c.getString("Customer number: "));

                System.out.println("\nYou entered:");
                System.out.print(currentCust.getDisplayText() + "\n");
            }

            else{
                Employee currentEmp = new Employee();

                currentEmp.setFirstName(c.getString("Enter first name: "));
                currentEmp.setLastName(c.getString("Enter last name: "));
                currentEmp.setEmailAddress(c.getString("Enter email address: "));
                currentEmp.setSSN(c.getString("Social security number: "));

                System.out.println("\nYou entered:");
                System.out.print(currentEmp.getDisplayText() + "\n");
            }

            choice = c.getString("\nContinue? (y/n): ");






        }









    }


}
