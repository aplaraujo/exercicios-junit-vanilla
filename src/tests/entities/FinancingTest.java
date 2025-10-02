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

    @Test
    public void setTotalAmountShouldUpdateTotalAmountWhenValidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 80;
        double newTotalAmount = 90000.00;
        Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
        financial.setTotalAmount(newTotalAmount);
        Assertions.assertEquals(newTotalAmount, financial.getTotalAmount());

    }

    @Test
    public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 20;
        double newTotalAmount = 90000.00;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
            financial.setTotalAmount(newTotalAmount);
        });
    }

    @Test
    public void setIncomeShouldUpdateTotalAmountWhenValidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 80;
        double newIncome = 3000.00;
        Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
        financial.setIncome(newIncome);
        Assertions.assertEquals(newIncome, financial.getIncome());
    }

    @Test
    public void setIncomeShouldThrowExceptionWhenInvalidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 20;
        double newIncome = 3000.00;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
            financial.setIncome(newIncome);
        });
    }

    @Test
    public void setMonthsShouldUpdateMonthsWhenValidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 80;
        int newMonthsQuantity = 90;
        Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
        financial.setMonths(newMonthsQuantity);
        Assertions.assertEquals(newMonthsQuantity, financial.getMonths());
    }

    @Test
    public void setMonthsShouldThrowExceptionWhenInvalidData() {
        double totalAmount = 100000.00;
        double income = 2000.00;
        Integer months = 20;
        int newMonthsQuantity = 90;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financial = FinancingFactory.createFinancial(totalAmount, income, months);
            financial.setMonths(newMonthsQuantity);
        });
    }
}
