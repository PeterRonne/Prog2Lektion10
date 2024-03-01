package opgave02.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {


    @Test
    void testNoFine() {
        Loan loan = new Loan(LocalDate.of(2024,3,7));
        int expected = 0;
        int actual = loan.calculateFine(LocalDate.now(), true);
        assertEquals(expected, actual);
    }

    @Test
    void testMinimumFineAdult() {
        Loan loan = new Loan(LocalDate.of(2024,2,26));
        int expected = 20;
        int actual = loan.calculateFine(LocalDate.now(), true);
        assertEquals(expected, actual);
    }

    @Test
    void testMediumFineAdult() {
        Loan loan = new Loan(LocalDate.of(2024,2,20));
        int expected = 60;
        int actual = loan.calculateFine(LocalDate.now(), true);
        assertEquals(expected, actual);
    }

    @Test
    void testMaximumFineAdult() {
        Loan loan = new Loan(LocalDate.of(2024,2,7));
        int expected = 90;
        int actual = loan.calculateFine(LocalDate.now(), true);
        assertEquals(expected, actual);
    }

    @Test
    void testMinimumFineChild() {
        Loan loan = new Loan(LocalDate.of(2024,2,26));
        int expected = 10;
        int actual = loan.calculateFine(LocalDate.now(), false);
        assertEquals(expected, actual);
    }

    @Test
    void testMediumFineChild() {
        Loan loan = new Loan(LocalDate.of(2024,2,20));
        int expected = 30;
        int actual = loan.calculateFine(LocalDate.now(), false);
        assertEquals(expected, actual);
    }

    @Test
    void testMaximumFineChild() {
        Loan loan = new Loan(LocalDate.of(2024,2,7));
        int expected = 45;
        int actual = loan.calculateFine(LocalDate.now(), false);
        assertEquals(expected, actual);
    }
}