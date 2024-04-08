package opgave01.models;

import examples.roman.RomanNumberConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CarInsuranceTest {
    private CarInsurance carInsurance;
    @BeforeEach
    void setUp() {
        carInsurance = new CarInsurance(1000);
    }

    @Test
    void test_CarInsurance_man_8YearsofExperience_35YearsOld() {
        Double expected = 750.0;
        Double actual = carInsurance.calculatePremium(35,false,8);
        assertEquals(expected, actual);
    }

    @Test
    void test_CarInsurance_man_9YearsofExperience_35YearsOld() {
        Double expected = 650.0;
        Double actual = carInsurance.calculatePremium(35,false,9);
        assertEquals(expected, actual);
    }

    @Test
    void test_CarInsurance_man_2YearsofExperience_23YearsOld() {
        Double expected = 1250.0;
        Double actual = carInsurance.calculatePremium(23,false,2);
        assertEquals(expected, actual);
    }

    @Test
    void test_CarInsurance_man_0YearsofExperience_25YearsOld() {
        Double expected = 1000.0;
        Double actual = carInsurance.calculatePremium(25,false,0);
        assertEquals(expected, actual);
    }


    @Test
    void throwException_Under18() {
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(16, false, 0));
    }
    @Test
    void throwException_IfAgeMinusExperienceIsLessThan18() {
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(18, false, 2));
    }

    @Test
    void throwException_negativYearsOfExperience() {
        assertThrows(RuntimeException.class, () -> carInsurance.calculatePremium(25, false, -5));
    }



}