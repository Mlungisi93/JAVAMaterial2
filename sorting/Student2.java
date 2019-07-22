package sorting;
import java.util.*;
import java.io.*;

 class Student2 implements Comparable<Student2>{

    int rollno;
    String name;
    int age;
    Student2(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student2 s1) {
        if(age == s1.age)
        {
            return 0;
        }else if(age > s1.age)
        {
            return 1;
        }else
        {
            return -1;
        }

    }
}
