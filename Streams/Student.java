/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.Serializable;
import java.util.*;

/**
 * Store the data of a student
 *
 * @Muninga (214247961)
 */
public final class Student implements Serializable, Comparable<Student>
{

    public static final int MIN_YEAR_OF_STUDY = 2016;
    public static final int MAX_YEAR_OF_STUDY = 2030;

    public enum Gender
    {

        MALE, FEMALE
    };

    private int number;
    private String surname;
    private String faculty;
    private Gender gender;
    private int yearOfStudy;

    public Student() throws DataException
    {
        this(0, "none", "none", Gender.MALE, 2010);
    }

    public Student(int number, String surname, String faculty,
            Gender gender, int yearOfStudy) throws DataException
    {
        setNumber(number);
        setSurname(surname);
        setFaculty(faculty);
        setGender(gender);
        setYearOfStudy(yearOfStudy);
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setSurname(String surname) throws DataException
    {
        if (surname.length() < 3)
        {
            throw new DataException("The surname is too short");
        }
        this.surname = surname;
    }

    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public void setYearOfStudy(int yearOfStudy) throws DataException
    {
        if (yearOfStudy >= MAX_YEAR_OF_STUDY && yearOfStudy <= MIN_YEAR_OF_STUDY)
        {
            throw new DataException("The year of study must be between "
                    + MIN_YEAR_OF_STUDY + " and " + MAX_YEAR_OF_STUDY);
        }
        this.yearOfStudy = yearOfStudy;
    }

    public int getNumber()
    {
        return number;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getFaculty()
    {
        return faculty;
    }

    public Gender getGender()
    {
        return gender;
    }

    public int getYearOfStudy()
    {
        return yearOfStudy;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[" + "number=" + number + ", surname="
                + surname + ", faculty=" + faculty + ", gender=" + gender
                + ", yearOfStudy=" + yearOfStudy + ']';
    }
    /**
     * Add new student to list
     * @throws DuplicateException if student number already exist
     */
    public void addStudent() throws DuplicateException
    {
        StudentDA.addPerNumber(this);
    }

    /**
     * Open the stream file
     * @throws DataStorageException if not found
     */
    public static void initialise() throws DataStorageException
    {
        StudentDA.initialise();
    }
    /**
     * Save the stream file
     * @throws DataStorageException if having problems if saving
     */

    public static void terminate() throws DataStorageException
    {
        StudentDA.terminate();
    }

    /**
     * 
     * @return All students store in the array list
     */
    public static ArrayList<Student> getAllStudents()
    {
        return StudentDA.getAllStudents();
    }
    /**
     * 
     * @param studentNo
     * @return Student data based on the student no
     * @throws NotFoundException if not found
     */

    public LinkedList<Student> findSudent(int studentNo) throws NotFoundException
    {
        return StudentDA.findStudent(studentNo);
    }

    /**
     * 
     * @param st1 Compare Student number and sort them in ascending order
     * @return -1 if st1 has a student number lower than this
     * @return 1 if st1 has a student number higher than this
     * @return 0 if the student number of st1 and this are the same
     */
    @Override
    public int compareTo(Student st1)
    {
        if (st1.getNumber() < this.getNumber())
        {
            return 1;
        }
        else if (st1.getNumber() > this.getNumber())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

}
