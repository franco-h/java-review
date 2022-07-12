package com.hr.corp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorporationTest {
    private Corporation corp;

    @Before
    public void setUp() {
        corp = new Corporation("Test Corp", 100000);
    }

    @Test
    public void testComputeMonthlyTaxToPay() {
        assertEquals(10000, corp.computeMonthlyTaxToPay(), 0.001);
    }

}