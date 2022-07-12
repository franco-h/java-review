package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // Attributes
    private double monthlySalary;
    private String name;
    private LocalDate localDate;

    // Constructor
    public SalariedEmployee(String name, LocalDate localDate) {
        setName(name);
        setLocalDate(localDate);
    }

    public SalariedEmployee(String name, LocalDate localDate, double monthlySalary) {
        setName(name);
        setLocalDate(localDate);
        this.monthlySalary = monthlySalary;
    }

    // Business methods
    @Override
    public double computeMonthlyCompensation() {
        return monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return monthlySalary * SALARIED_TAX_RATE;
    }

    @Override
    public String getEmployeeInfo() {
        return "Name: " + getName() + "\n" +
                "Hire Date: " + getLocalDate() + "\n" +
                "Monthly Salary: " + getMonthlySalary() + "\n" +
                "Monthly Compensation: " + computeMonthlyCompensation() + "\n" +
                "Monthly Tax To Pay: " + computeMonthlyTaxToPay();
    }

    // Accessor methods
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}