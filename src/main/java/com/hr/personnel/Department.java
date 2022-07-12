package com.hr.personnel;

import java.util.Arrays;
import java.util.Objects;

public class Department {


    // Attributes
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];;
    private int currentIndex = 0;

    // Constructor
    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Business methods
    public void addEmployee(Employee employee) {
//        employees[currentIndex++] = employee;
        // sort the Employees array by hiring date. If the hiring date of two employees is the same, sort by name.
        employees[currentIndex++] = employee;

        Arrays.sort(employees, 0, currentIndex, (e1, e2) -> {
            if (e1.getLocalDate().isEqual(e2.getLocalDate())) {
                return e1.getName().compareTo(e2.getName());
            } else {
                return e1.getLocalDate().compareTo(e2.getLocalDate());
            }
        });
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = 0;

        // currentIndex ensure that we are not accessing out of the array bounds
        for (int i = 0; i < currentIndex; i++) {
            String work = employees[i].work();
            if (work.contains("worked")) {
                numberOfEmployeesWhoWorked++;
            }
        }

        /*for (Employee employee : employees) {
            String work = employee.work();
            numberOfEmployeesWhoWorked++;
            employee.work();
        }

        Problem of this is that this FOR LOOP goes through 100 buckets
         */

        return numberOfEmployeesWhoWorked;
    }

    public double computeDepartmentMonthlyTotalCompensation() {
        double totalCompensation = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            double monthlyCompensation = employees[i].computeMonthlyCompensation();
            totalCompensation += monthlyCompensation;
        }
        return totalCompensation;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return getCurrentIndex() == that.getCurrentIndex() && Objects.equals(getName(), that.getName()) && Objects.equals(getLocation(), that.getLocation()) && Arrays.equals(getEmployees(), that.getEmployees());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getLocation(), getCurrentIndex());
        result = 31 * result + Arrays.hashCode(getEmployees());
        return result;
    }
}