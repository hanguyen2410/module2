package bai5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testFizzBuzz() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz1(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizzBuzz11() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz1(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizzBuzz111() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz1(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz1111() {
        int number = 7;
        String expected = "7";
        String result = FizzBuzz.fizzBuzz1(number);
        assertEquals(expected,result);
    }

    @Test
   void testFizzBuzz2() {
        int number = 13;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz2(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz22() {
        int number = 52;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz2(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz222() {
        int number = 31;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz2(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz2222() {
        int number = 27;
        String expected = "27";
        String result = FizzBuzz.fizzBuzz2(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz22222() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz2(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizzBuzz3() {
        int number = 13;
        String expected = "motFizz";
        String result = FizzBuzz.fizzBuzz3(number);
        assertEquals(expected,result);
    }

    @Test
    void testFizzBuzz33() {
        int number = 31;
        String expected = "Fizzmot";
        String result = FizzBuzz.fizzBuzz3(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz333() {
        int number = 25;
        String expected = "haiBuzz";
        String result = FizzBuzz.fizzBuzz3(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz3333() {
        int number = 52;
        String expected = "Buzzhai";
        String result = FizzBuzz.fizzBuzz3(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz33333() {
        int number = 35;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz3(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz333333() {
        int number = 53;
        String expected = "BuzzFizz";
        String result = FizzBuzz.fizzBuzz3(number);
        assertEquals(expected,result);
    }
}