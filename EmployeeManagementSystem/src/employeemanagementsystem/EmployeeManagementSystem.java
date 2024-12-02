/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagementsystem;
import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {
   public static void main(String[] args) {
       String fname;
    Scanner scan = new Scanner(System.in);

    /* enter filename with extension to open and read its content */

    System.out.print("Enter File Name to Open (with extension like file.txt) : ");
    fname = scan.nextLine();



    String line = null;
    try
    {
        FileReader fileReader = new FileReader(fname);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null)
        {
            System.out.println(line);
        }

        bufferedReader.close();
    }
    catch(IOException ex)
    {
        System.out.println("Error reading file named '" + fname + "'");
    }
}}
    
    
    

