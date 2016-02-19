package business;

/**
 * Created by Alvaro on 2/17/2016.
 * Console class from chapter 8 murach
 */

public class Customer extends Person {

   private String customerNumber;

   public void setCustomerNumber(String customerNumber){this.customerNumber = customerNumber;}

   public String getCustomerNumber(){return this.customerNumber;}

   public Customer () {

   }

   public String getDisplayText(){ return
      this.toString() +"\n" + "Customer number: " + this.getCustomerNumber();
   }
}
