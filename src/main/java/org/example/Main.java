package org.example;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData=new EmployeeData();
        Employee emp=employeeData.getEmployee(1);
        /*if (emp != null) {
            Date hireDate = Date.valueOf("2024-02-07");
            emp.setHireDate(hireDate);
            int id = employeeData.createEmployee("Silvi", "designer", 100000, emp.getHireDate());
            employeeData.updateEmployee(2,"Maya","frontender",200000,emp.getHireDate());
        } else {
            System.out.println("Employee not found, cannot proceed.");
        }*/
        employeeData.getEmployee(1);



    }
}