/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Employee {
    private String name;
    private String department;
    private String contact;
    private String designation;
    private double salary;
    private String status;

    public Employee(String name, String department, String contact, String designation, double salary, String status) {
        this.name = name;
        this.department = department;
        this.contact = contact;
        this.designation = designation;
        this.salary = salary;
        this.status = status;
    }

    // Getters for employee details
    // (You can add setters if needed)

    @Override
    public String toString() {
        return "Name: " + name +
                "\nDepartment: " + department +
                "\nContact: " + contact +
                "\nDesignation: " + designation +
                "\nSalary: $" + salary +
                "\nStatus: " + status + "\n";
    }
}
