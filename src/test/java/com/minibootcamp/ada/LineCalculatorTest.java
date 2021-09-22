package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineCalculatorTest {

    @Test
    public void testCalculateLineLengthGiven0InputsExpectReturn0() {
        LineCalculator lineCalculator = new LineCalculator();

        assertEquals(0, lineCalculator.calculateLineLength(0, 0, 0, 0));
    }

    @Test
    public void testCalculateLineLengthGivenSameInputsExpectReturn0() {
        LineCalculator lineCalculator = new LineCalculator();

        assertEquals(0, lineCalculator.calculateLineLength(1, 1, 1, 1));
    }
}
