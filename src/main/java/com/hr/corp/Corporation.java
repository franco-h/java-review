package com.hr.corp;

import gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    private String name;
    private double monthlyIncome;

    public Corporation(String name, double monthlyIncome) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return monthlyIncome * CORP_TAX_RATE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
}