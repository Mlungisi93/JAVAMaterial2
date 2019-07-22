package person;

import java.util.Objects;

public class Customer extends Person {
    private double creditLimit;
    private int coReg;// company registration should have been an int

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCoReg() {
        return coReg;
    }

    public void setCoReg(int coReg) {
        this.coReg = coReg;
    }

    @Override
    public String getSalutation() {

        return "Hello Valued Customer";
    }

    @Override
    public String toString() {
        return "Customer Company Registration: " +
                coReg + " Customer Name: "+
                super.getName();
    }

    @Override
    public boolean equals(Object o) {
        boolean isEquel = false;
       if(o instanceof Customer)
       {
           Customer customer = (Customer) o;
           isEquel= this.coReg == customer.coReg;
       }
        return isEquel;

    }

    @Override
    public int hashCode() {
        return Objects.hash(coReg);
    }
}
