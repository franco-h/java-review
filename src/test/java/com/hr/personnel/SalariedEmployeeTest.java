package com.hr.personnel;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SalariedEmployeeTest {
    private SalariedEmployee salariedEmployee;

    @Before
    public void setUp() {
        salariedEmployee = new SalariedEmployee("Jane", LocalDate.of(2020, 1, 1),
                6000.0);
    }

    @Test
    public void computeMonthlyTaxToPay() {
        double monthlyTaxToPay = salariedEmployee.computeMonthlyTaxToPay();
        assertEquals(1800.0, monthlyTaxToPay, 0.0);
    }
}