package gov.irs;

import com.hr.corp.Corporation;
import com.hr.personnel.SalariedEmployee;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class IRSTest {
    private IRS irs;

    @Test
    public void register() {
        irs = new IRS(new TaxPayer[100], 0);
        irs.register(new Corporation("Test Corp", 100000));
        irs.register(new SalariedEmployee("Test Employee", LocalDate.now(), 1000));
        irs.register(new SalariedEmployee("Test Employee 2", LocalDate.now(), 2000));
        assertEquals(3, irs.getCurrentIndex());

    }

    @Test
    public void computeTotalMonthlyTaxCollect() {
        irs = new IRS(new TaxPayer[100], 0);
        irs.register(new Corporation("Test Corp", 100000));
        assertEquals(10000, irs.computeTotalMonthlyTaxCollect(), 0.001);
    }
}