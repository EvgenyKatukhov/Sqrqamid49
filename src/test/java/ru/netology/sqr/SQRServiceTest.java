package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void SquareRoot() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calceSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalcZeroNumberSquareRoot() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calceSqr(200_000, 600_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalculateWhenOneSquareRoot() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calceSqr(50, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalculateWhenOfSquaresMaxLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calceSqr(100, 9801);

        Assertions.assertEquals(expected, actual);
    }
}