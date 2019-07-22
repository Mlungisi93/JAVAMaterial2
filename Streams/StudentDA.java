/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.*;
import java.util.*;

/**
 *
 * @author Muninga
 */
final class StudentDA
{

    private static File studentFile = new File("student.dat");
    private static LinkedList<Student> lstStudent = new LinkedList<>();

    static void initialise() throws DataStorageException
    {
        ObjectInputStream ois;
        FileInputStream fis;


        try
        {
            fis = new FileInputStream(studentFile);
            ois = new ObjectInputStream(fis);
            lstStudent = (LinkedList<Student>) ois.readObject();
            ois.close();
        }
        catch (ClassNotFoundException e)
        {
            throw new DataStorageException("Error 1 : Could not locate the class \n" + e.getMessage());
        }
        catch (IOException ex)
        {
            throw new DataStorageException("Error 2 : Could not Open the file \n" + ex.getMessage());
        }
    }

    static void terminate() throws DataStorageException
    {
        ObjectOutputStream oos;
        FileOutputStream fos;
        try
        {
            fos = new FileOutputStream(studentFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(lstStudent);
            oos.close();
        }
        catch (IOException e)
        {
            throw new DataStorageException("Error 3 : Could not Save to the file \n" + e.getMessage());
        }
    }

    static void addObject(Student std)
    {
        lstStudent.addLast(std);
    }

    static ArrayList<Student> getAllStudents()
    {
        ArrayList<Student> arStudent = new ArrayList<>();
        for (Iterator<Student> iterator = lstStudent.iterator(); iterator.hasNext();)
        {
            Student st = iterator.next();
            arStudent.add(st);
        }
        return arStudent;
    }

    static LinkedList<Student> findStudent(int studenNo) throws NotFoundException
    {
        LinkedList<Student> lstStudent = null;
        boolean found = false;

        for (Iterator<Student> iterator = lstStudent.iterator(); iterator.hasNext();)
        {
            Student st = iterator.next();
            if (st.getNumber() == studenNo)
            {
                found = true;
                lstStudent.add(st);
            }
        }

        if (found)
        {
            return lstStudent;
        }
        else
        {
            return null;
        }

    }

    static void addPerNumber(Student std) throws DuplicateException
    {
        boolean duplicate = false;

        for (int i = 0; i < lstStudent.size(); i++)
        {
            Student mySt = lstStudent.get(i);
            if (mySt.getNumber() == std.getNumber())
            {
                duplicate = true;
                break;
            }
        }
        if (duplicate)
        {
            throw new DuplicateException("Student Already exist with the Student Number " + std.getNumber());
        }
        else
        {
            Collections.sort(lstStudent);
            lstStudent.add(std);
            
        }
    }

}
