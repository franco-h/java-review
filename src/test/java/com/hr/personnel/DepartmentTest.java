package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class DepartmentTest {
    private Department department;

    @Before
    public void setUp () {
        department = new Department("Marketing", "New York");
        SalariedEmployee jane = new SalariedEmployee("Jane",
                LocalDate.of(2020, 1, 1), 6000.0);
        department.addEmployee(jane);
    }

    @Test
    public void addEmployee_should_add_an_employee_correctly() {
        int currentIndex = department.getCurrentIndex();
        assertEquals(1, currentIndex);
    }


    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        assertEquals(1, numberOfEmployeesWhoWorked);
    }

    @Test
    public void computeDepartmentMonthlyTotalCompensation_should_return_correct_value() {
        double totalCompensation = department.computeDepartmentMonthlyTotalCompensation();
        assertEquals(6000.0, totalCompensation, 0.0);
    }
}