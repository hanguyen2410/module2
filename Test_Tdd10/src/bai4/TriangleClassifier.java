package bai4;

public class TriangleClassifier {
    public static String typeOfTriangle(int a, int b, int c){
        boolean isABCBiggerThanZero = a > 0 && b > 0 && c > 0;
        if(isABCBiggerThanZero & a == b & a == c) {
            return "Tam Giác có 3 cạnh a = " + a +", b = " + b+ " Và c = "+ c+ " là tam giác đều";
        } else if (isABCBiggerThanZero && a == b || a == c) {
            return "Tam Giác có 3 cạnh a = " + a +", b = " + b+ " Và c = "+ c+ " là tam giác cân";
        }else if (isABCBiggerThanZero && a + b > c && a+c > b&& b + c >a) {
            return "Tam Giác có 3 cạnh a = " + a +", b = " + b+ " Và c = "+ c+ " là tam giác thường";
        } else return "Tam Giác có 3 cạnh a = " + a +", b = " + b+ " Và c = "+ c+ " không phải là tam giác";
    }
}
