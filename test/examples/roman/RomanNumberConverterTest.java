package examples.roman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberConverterTest {

    @Test
    @DisplayName("MMD")
    void convertToRomanNumber() {
        String expected = "MMD";
        String actual = RomanNumberConverter.convertToRomanNumber(2500);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("MMD")
    void convert9ToRomanNumber() {
        String expected = "IX";
        String actual = RomanNumberConverter.convertToRomanNumber(9);
        assertEquals(expected, actual);
    }


}