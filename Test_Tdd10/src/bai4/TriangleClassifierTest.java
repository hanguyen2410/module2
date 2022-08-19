package bai4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTypeOfTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam Giác có 3 cạnh a = 2, b = 2 Và c = 2 là tam giác đều";
        String result = TriangleClassifier.typeOfTriangle(2,2,2);
        assertEquals(expected,result);
    }
    @Test
    void testTypeOfTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam Giác có 3 cạnh a = 2, b = 2 Và c = 3 là tam giác cân";
        String result = TriangleClassifier.typeOfTriangle(2,2,3);
        assertEquals(expected,result);
    }
    @Test
    void testTypeOfTriangle2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam Giác có 3 cạnh a = 3, b = 4 Và c = 5 là tam giác thường";
        String result = TriangleClassifier.typeOfTriangle(3,4,5);
        assertEquals(expected,result);
    }
    @Test
    void testTypeOfTriangle3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "Tam Giác có 3 cạnh a = 8, b = 2 Và c = 3 không phải là tam giác";
        String result = TriangleClassifier.typeOfTriangle(8,2,3);
        assertEquals(expected,result);
    }
    @Test
    void testTypeOfTriangle4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Tam Giác có 3 cạnh a = -1, b = 2 Và c = 1 không phải là tam giác";
        String result = TriangleClassifier.typeOfTriangle(-1,2,1);
        assertEquals(expected,result);
    }
}