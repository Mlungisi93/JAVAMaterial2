package sorting;

import java.util.ArrayList;
import java.util.*;

import static java.util.Collections.*;

public class StudentComparableTester {
    public static void main(String[] args)
    {
        ArrayList<Student2> students = new ArrayList<Student2>();

        students.add(new Student2(1001,"Mlungisi",25));
        students.add(new Student2(101,"Vijay",23));
        students.add(new Student2(106,"Ajay",27));
        students.add(new Student2(105,"Jai",21));

        Collections.sort(students);
        for(Student2 st: students){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
