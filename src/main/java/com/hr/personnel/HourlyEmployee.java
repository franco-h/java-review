package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // Attributes
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    // Constructor
    public HourlyEmployee(String name, LocalDate localDate) {
        setName(name);
        setLocalDate(localDate);
    }

    public HourlyEmployee(String name, LocalDate localDate, int hoursWorkedPerMonth, double hourlyRate) {
        setName(name);
        setLocalDate(localDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    // Business methods
    @Override
    public double computeMonthlyCompensation() {
        return hoursWorkedPerMonth * hourlyRate;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }


    @Override
    public String getEmployeeInfo() {

        return "Name: " + getName() + "\n" +
                "Hire Date: " + getLocalDate() + "\n" +
                "Hours Worked Per Month: " + getHoursWorkedPerMonth() + "\n" +
                "Hourly Rate: " + getHourlyRate() + "\n" +
                "Monthly Compensation: " + computeMonthlyCompensation() + "\n" +
                "Monthly Tax To Pay: " + computeMonthlyTaxToPay();
    }

    // Accessor methods
    public int getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(int hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}