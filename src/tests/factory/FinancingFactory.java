package tests.factory;

import entities.Financing;

public class FinancingFactory {
    public static Financing createFinancial(Double totalAmount, Double income, Integer months) {
        return new Financing(totalAmount, income, months);
    }
}
