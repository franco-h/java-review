package com.hr.personnel.cilent;
import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {

        // Create two SalariedEmployee objects and one HourlyEmployee objects
        Employee salariedEmployee1 = new SalariedEmployee("Hui", LocalDate.of(2022,
                4, 11));
        Employee salariedEmployee2 = new SalariedEmployee("Zhang", LocalDate.of(2022,
                4, 11));

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Li", LocalDate.of(2022, 4,
                11));

        Employee employee1 = new SalariedEmployee("Hui", LocalDate.of(2022, 4, 11),
                50000);

        // Set a new salary for salariedEmployee1
        ((SalariedEmployee) salariedEmployee1).setMonthlySalary(60000);

        // Set a new hourly rate and hours worked for hourlyEmployee
        hourlyEmployee.setHourlyRate(45);
        hourlyEmployee.setHoursWorkedPerMonth(40);


        // Add the employees to the Department object
        Department department = new Department("HR", "Seattle");
        department.addEmployee(salariedEmployee1);
        department.addEmployee(salariedEmployee2);
        department.addEmployee(hourlyEmployee);

        // Create a new Employee object and assign it to the HourlyEmployee object
        String employeeInfo1 = hourlyEmployee.getEmployeeInfo();
        System.out.println(employeeInfo1);

        String employeeInfo2 = salariedEmployee1.getEmployeeInfo();
        System.out.println(employeeInfo2);

        String work1 = salariedEmployee1.work();
        System.out.println(work1);

        int numberOfYearsWorkedSinceHired1 = hourlyEmployee.computeNumberOfYearsWorkedSinceHired();
        // Print the name and number of years worked since hireDate of the Employee object
        System.out.println("Name: " + hourlyEmployee.getName() + " Number of years worked since hireDate: "
                + numberOfYearsWorkedSinceHired1);

        int numberOfYearsWorkedSinceHired2 = salariedEmployee1.computeNumberOfYearsWorkedSinceHired();
        // Print the name and number of years worked since hireDate of the Employee object
        System.out.println("Name: " + salariedEmployee1.getName() + " Number of years worked since hireDate: "
                + numberOfYearsWorkedSinceHired2);

        int numberOfYearsWorkedSinceHired3 = salariedEmployee2.computeNumberOfYearsWorkedSinceHired();
        // Print the name and number of years worked since hireDate of the Employee object
        System.out.println("Name: " + salariedEmployee2.getName() + " Number of years worked since hireDate: "
                + numberOfYearsWorkedSinceHired3);

        // Invoke letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() method of the Department object
        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("Number of employees who worked: " + numberOfEmployeesWhoWorked);

        // Print salary of salariedEmployee1
        System.out.println("Salary of salariedEmployee1: " + ((SalariedEmployee) salariedEmployee1).getMonthlySalary());

        // Print salary of hourlyEmployee
        System.out.println("Salary of hourlyEmployee: " + hourlyEmployee.computeMonthlyCompensation());

        // Print total monthly salary of the Department object
        System.out.println("Total monthly salary of the Department object: " + department.computeDepartmentMonthlyTotalCompensation());

    }
}