package opgave01.models;

import examples.roman.RomanNumberConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    private CarInsurance carInsurance;
    @BeforeEach
    void setUp() {
        carInsurance = new CarInsurance(100);
    }

    @Test
    void calculatePremiumForLessThan25AndWoman() {
        Double expected = 130.0;
        Double actual = carInsurance.calculatePremium(24,true,2);
        assertEquals(expected, actual);
    }

    @Test
    void calculatePremiumMoreThan25() {
        Double expected = 85.0;
        Double actual = carInsurance.calculatePremium(28,false,3);
        assertEquals(expected, actual);
    }

    @Test
    void throwExceptionUnder18() {
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(15, false, 0));
    }
    @Test
    void throwExceptionIfAgeMinusExperienceIsLessThan18() {
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(20, false, 5));
    }
}