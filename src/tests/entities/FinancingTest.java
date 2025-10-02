package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

public class FinancingTest {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 80;
        Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
        Assertions.assertEquals(totalAmount, financial.getTotalAmount());
        Assertions.assertEquals(income, financial.getIncome());
        Assertions.assertEquals(months, financial.getMonths());
    }

    @Test
    public void constructorShouldThrowExceptionWhenInvalidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 20;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
        });
    }
}
