package sorting;
import java.util.*;
import java.io.*;
public class ComparatorTester {
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name");

        /*
        Older java versions use this comparator interface
           Collections.sort(al,new NameComparator());
         */

        //Sorting elements on the basis of name
        Comparator<Student> cm1=Comparator.comparing(Student::getName);
        Collections.sort(al,cm1);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("Sorting by age");
/*
 Collections.sort(al,new AgeComparatorNonGenetic());
 */

        Comparator<Student> cm2=Comparator.comparing(Student::getAge);
        Collections.sort(al,cm2);
        Iterator itr2=al.iterator();
        while(itr2.hasNext()){
            Student st=(Student)itr2.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
