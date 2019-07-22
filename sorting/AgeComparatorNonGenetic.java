package sorting;
/*
This class defines comparison logic based on the age.
If the age of the first object is greater than the second,
we are returning a positive value. It can be anyone such as 1, 2, 10.
 If the age of the first object is less than the second object, we are returning a negative value,
 it can be any negative value, and if the age of both objects is equal, we are returning 0.
 */
 import java.util.*;
public  class AgeComparatorNonGenetic implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        if(s1.age > s2.age)
        {
            return 1;

        }else if(s1.age < s2.age)
        {
            return -1;

        }else
        {
            return 0;
        }


    }
}