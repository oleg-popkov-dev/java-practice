package BigDecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100.0"), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal("150.0"), new VATaxType(), taxService),
                new Bill(new BigDecimal("200.0"), new ProgressiveTaxType(), taxService)
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}