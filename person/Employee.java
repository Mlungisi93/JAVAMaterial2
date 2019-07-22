package person;

import java.util.Objects;

public class Employee extends Person {
    private double salary;
    private int empId;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String getSalutation() {

        return "Hello Valued Employee";
    }

    @Override
    public String toString() {
        return "Employee Id; " +
                 empId + " Emoplyee Name: "+
                super.getName();
    }

    @Override
    public boolean equals(Object o) {
        boolean isEquel = false;
       if(o instanceof Employee)
       {
           Employee employee = (Employee) o;
           isEquel= this.empId == employee.empId;
       }
      return isEquel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}
