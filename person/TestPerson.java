package person;

public class TestPerson {
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.setAddress("Dannhauser 3080");
        emp1.setName("Mlungisi");
        emp1.setEmpId(1);


        emp2.setAddress("Newcastle 2940");
        emp2.setName("Kevin");
        emp2.setEmpId(2);

        emp3.setAddress("Joburg 2940");
        emp3.setName("Dean");
        emp3.setEmpId(1);
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.setAddress("Vanderbijlpark 1911");
        customer1.setName("John");
        customer1.setCoReg(1);

        customer2.setAddress("Vereeniging 200");
        customer2.setName("James");
        customer2.setCoReg(2);

        customer3.setAddress("Revonia 200");
        customer3.setName("Mat");
        customer3.setCoReg(1);


        printChristmasInvite(emp1);
      printChristmasInvite(customer1);
        printChristmasInvite(emp2);
        printChristmasInvite(customer2);
        System.out.println("Employee1 == Employee 2: " +emp1.equals(emp2));

        System.out.println("Employee1 == Employee 3: " +emp1.equals(emp3));

        System.out.println("Customer1 == Customer 2: " +customer1.equals(customer2));
        System.out.println("Customer1 == Customer 3: " +customer1.equals(customer3));


    }

    public static void printChristmasInvite(Person person)
    {
        System.out.println(person.getSalutation()+ ", "+person.getName());
        System.out.println("Adreess: "+person.getAddress());
    }
}
