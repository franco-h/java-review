package gov.irs;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0; // for dealing with the array

    public IRS(TaxPayer[] taxPayers, int currentIndex) {
        this.taxPayers = taxPayers;
        this.currentIndex = currentIndex;
    }

    public void register(TaxPayer taxPayer) {
        taxPayers[currentIndex] = taxPayer;
        currentIndex++;
    }

    public double computeTotalMonthlyTaxCollect() {
        double total = 0;
        // - for every TaxPayer object in the array, call
        //   computeMonthlyTaxToPay() method and add the result to total
        for (int i = 0; i < currentIndex; i++) {
            total += taxPayers[i].computeMonthlyTaxToPay();
        }
        return total;
    }

    public TaxPayer[] getTaxPayers() {
        return taxPayers;
    }

    public void setTaxPayers(TaxPayer[] taxPayers) {
        this.taxPayers = taxPayers;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }
}