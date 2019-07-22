/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import javax.swing.JFrame;

/**
 *
 * @author Muninga
 */
public class StudentScreenRunner
{

    
    public static void main(String[] args)
    {
      JFrame studentApp = new StudentScreen();
      studentApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      studentApp.setSize(800,500);
      studentApp.setTitle("Muninga 214247961 - Add Student");
      studentApp.setVisible(true);
    }
    
}
