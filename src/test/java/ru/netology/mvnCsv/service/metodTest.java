package ru.netology.mvnCsv.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class metodTest {

    @Test
    public void numberOfMonthSatLowCost() {
        metod service = new metod();

        // подготавливаем данные:
        int income = 10_000;
        int expense = 3_000;
        int threshold = 0;
        int expected = 3;

        // вызываем целевой метод:

        int actual = service.calc(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthsAtHighCost() {
        metod2 service = new metod2();

        int income = 100_000;
        int expense = 60_000;
        int threshold = 0;
        int expected = 2;

        // вызываем целевой метод:

        int actual = service.calc(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
