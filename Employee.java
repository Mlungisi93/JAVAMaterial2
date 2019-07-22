
public class Employee {

    private String name;
    public double salary;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String employeeName) {
        name=employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(double pay) {
        if (pay<0) {
            pay=0;
        }
        salary=pay;
    }

    public void setId(int empId) {
        id = empId;
    }

    public void printEmployee() {
        int id = -100;
        System.out.println(id);
    }

}
