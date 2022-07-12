package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {

    private HourlyEmployee hourlyEmployee;

    @Before
    public void setUp() {
        hourlyEmployee = new HourlyEmployee("Jane", LocalDate.of(2020, 1, 1),
                10, 20.0);
    }

    @Test
    public void computeMonthlyTaxToPay_should_return_correct_value() {
        double monthlyTaxToPay = hourlyEmployee.computeMonthlyTaxToPay();
        assertEquals(50.0, monthlyTaxToPay, 0.0);
    }

}