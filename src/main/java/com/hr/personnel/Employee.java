package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public abstract class Employee implements TaxPayer {

    // Attributes
    private String name;
    private LocalDate localDate;

    // Business methods
    public String work() {
        return name + " worked";
    }

    // If current year is 2022 and the year of hireDate is
    // 2020, it returns 2
    public int computeNumberOfYearsWorkedSinceHired() {
        // add code here - do not use deprecated method
        int currentYear = LocalDate.now().getYear();
        int hireYear = localDate.getYear();
        return currentYear - hireYear;
    }

    public abstract double computeMonthlyCompensation();

    // Accessor methods
    public abstract String getEmployeeInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}