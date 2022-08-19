package bai3;

public class NextDayCalculator {
    public static String findNextday(int day, int month, int year) {
        if (day < 0)
            return -day + 1 +"-" + month + "-" + year;
        else if (day == 0)
            return day + 2 + "-" + month + "-" + year;
        else return day + 1 + "-" + month + "-" + year;
    }
}
