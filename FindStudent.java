import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindStudent {


    public static void main(String[] args) {
        String searchString = "Mlungisi";
        String[][] students =
                {   {"Dave", "Bonnie", "Hannah","Jack"},
                        {"Iris"},
                        {"Amy", "Jessica", "Francis", "Carl", "Keith"},
                        {"Ellen", "George", "Lydia", "Iris", "Daisy", "Ursula", "Trevor", "Martin"}  };
        String location = findStudent(students, searchString);
        if (location == null)
        {
            System.out.println("Invalid");
        }
        else
        {
            String[] locationValues = location.split("-");

            System.out.println("The student named "+searchString+" was found at outer array position "+locationValues[0]+" and inner array position "+locationValues[1]);
            System.out.println("Bye!");
        }

    }

    public static String findStudent(String[][] students, String searchString){
        int studentsCount = 0;
        String location = "0.0";
        for(studentsCount=0; studentsCount < students.length; studentsCount++){
            for(int innerArrayCount = 0; innerArrayCount < students[studentsCount].length; innerArrayCount++){
                if(students[studentsCount][innerArrayCount].equals(searchString)){
                    location = ""+studentsCount+"-"+innerArrayCount;
                    return location;
                }
                else
                {
                    location = null;
                }
            }
        }
        return location;
    }
}
