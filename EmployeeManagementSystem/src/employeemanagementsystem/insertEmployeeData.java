/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.io.FileWriter;
import java.io.IOException;

public class insertEmployeeData{

    public static void insertEmployeeData(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Employee Name, Employee Department, Employee Contact, Employee Designation, Employee Salary, Employee Status\n");
            writer.write("John Doe, IT, 1234567890, Manager, 5000, Active\n");
            writer.write("Jane Smith, HR, 9876543210, HR Specialist, 4000, Active\n");
            writer.write("Michael Johnson, Finance, 5551234567, Accountant, 4500, Inactive\n");
            writer.close();
        } catch (IOException e) {
        }
    }}