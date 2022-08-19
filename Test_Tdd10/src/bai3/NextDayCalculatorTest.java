package bai3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    void testFindNextDay(){
        int day = 2;
        int month = 5;
        int year = 2000;
        String expected = "3-5-2000";
        String result = NextDayCalculator.findNextday(day,month,year);
        assertEquals(expected,result);
    }

    @Test
    void testfindNextday() {
        int day = -10;
        int month = 8;
        int year = 2005;
        String expected = "11-8-2005";
        String result = NextDayCalculator.findNextday(day,month,year);
        assertEquals(expected,result);
    }
}
