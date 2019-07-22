/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import Streams.Student;
import  Streams.Student.Gender;

/**
 *
 * @author Muninga(214247961)
 */
public class StudentScreen extends JFrame
{

    private JTextField txtStudentNumber, txtSurname;
    private JRadioButton rdoMale, rdoFemale;
    private JComboBox<String> cmbFaculty;
    private JComboBox<Integer> cmbYearOfStudy;
    private JButton btnAddStudent, btnClear;
    private File facultyFile = new File("faculties.txt");

    public StudentScreen()
    {
        addWindowListener(new WindowListener());

        txtStudentNumber = new JTextField(10);
        txtSurname = new JTextField(20);
        cmbFaculty = new JComboBox<>();
        cmbYearOfStudy = new JComboBox<>();
        rdoFemale = new JRadioButton("Female");
        rdoMale = new JRadioButton("Male");
        ButtonGroup btnGrp = new ButtonGroup();
        btnAddStudent = new JButton("Add Student");
        btnClear = new JButton("Clear");

        btnGrp.add(rdoMale);
        btnGrp.add(rdoFemale);

        JPanel pnlData = new JPanel();
        pnlData.setLayout(new FlowLayout());
        pnlData.add(new JLabel("Student Number : ", SwingConstants.RIGHT));
        pnlData.add(txtStudentNumber);

        JPanel pnSurname = new JPanel();
        pnSurname.setLayout(new FlowLayout());
        pnSurname.add(new JLabel("Surname : ", SwingConstants.RIGHT));
        pnSurname.add(txtSurname);

        JPanel pnGender = new JPanel();
        pnGender.setLayout(new FlowLayout());
        pnGender.add(new JLabel("Gender : "));
        pnGender.add(rdoFemale);
        pnGender.add(rdoMale);
        rdoFemale.setSelected(true);

        for (int i = 2016; i <= 2030; i++)
        {
            cmbYearOfStudy.addItem(i);
        }

        String line;
        Scanner in = null;
        try
        {
            in = new Scanner(new FileReader(facultyFile));
            while (in.hasNext())
            {
                line = in.nextLine();
                cmbFaculty.addItem(line);
            }
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Could not open the file " + e.getMessage());
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }

        }

        JPanel pnlCom = new JPanel();
        pnlCom.setLayout(new FlowLayout());
        pnlCom.add(new JLabel("Faculty : "));
        pnlCom.add(cmbFaculty);
        pnlCom.add(new JLabel("Year Of Study : "));
        pnlCom.add(cmbYearOfStudy);

        JPanel pnlBtn = new JPanel();
        pnlBtn.setLayout(new FlowLayout());
        pnlBtn.setBorder(new EtchedBorder());
        pnlBtn.add(btnAddStudent);
        pnlBtn.add(btnClear);

        Container con = getContentPane();
        con.setLayout(new GridLayout(5, 1));
        con.add(pnlData);
        con.add(pnSurname);
        con.add(pnGender);
        con.add(pnlCom);
        con.add(pnlBtn);

        btnAddStudent.addActionListener(new btnAddStudentListener());
        btnClear.addActionListener(new btnClear());
        try
        {
            Student.initialise();
        }
        catch (DataStorageException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    private class btnAddStudentListener implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            int studentNo;
            String surname;
            String faculty;
            int yearOfStudy;
            Gender gender;

            try
            {
                studentNo = Integer.parseInt(txtStudentNumber.getText().toString());
                surname = txtSurname.getText().toString();
                faculty = cmbFaculty.getSelectedItem().toString();
                yearOfStudy = Integer.parseInt(cmbYearOfStudy.getSelectedItem().toString());
                if (rdoFemale.isSelected())
                {
                    gender = Gender.FEMALE;
                }
                else
                {
                    gender = Gender.MALE;
                }

                Student objStudent = new Student(studentNo, surname, faculty, gender, yearOfStudy);
                objStudent.addStudent();
                JOptionPane.showMessageDialog(null, "Student added successfully");
                doClear();
                ArrayList<Student> allStudent = Student.getAllStudents();
                for (Student st : allStudent)
                {
                    System.out.println(st.toString());
                }

            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Only Numeric Value in the Student Field");
                txtStudentNumber.requestFocus();
            }
            catch (IllegalArgumentException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            catch (DataException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            catch (DuplicateException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
    }

    private class btnClear implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            doClear();
        }
    }

    private class WindowListener extends WindowAdapter
    {

        public void windowClosing(WindowEvent ae)
        {
            try
            {
                Student.terminate();
                
            }
            catch (DataStorageException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }

    private void doClear()
    {
        txtStudentNumber.setText("");
        txtSurname.setText("");
        rdoFemale.setSelected(true);
        cmbFaculty.setSelectedIndex(0);
        cmbYearOfStudy.setSelectedIndex(0);
        txtStudentNumber.requestFocus();
    }
}
