package gov.irs;

public interface TaxPayer {

    public double computeMonthlyTaxToPay(); // returns amount of monthly tax to pay

    public static final double DEFAULT_STANDARD_DEDUCTION = 7500.0;

    default public double getStandardDeduction() {
        return DEFAULT_STANDARD_DEDUCTION;
    }

    public static final double HOURLY_TAX_RATE = 0.25;
    public static final double SALARIED_TAX_RATE = 0.30;
    public static final double CORP_TAX_RATE = 0.10;
}
