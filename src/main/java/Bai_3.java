public class Bai_3 {
    public static String isMonth(int n) {
        int day = 0;
        if (0 < n && n <= 12) {
            if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
                day = 31;
            else if (n == 2)
                day = 28;
            else day = 30;
            return "This is a month of year and have " + day + " day";
        } else {
            return "This is not a month of year";
        }
    }

    public static void main(String[] args) {
        System.out.println(isMonth(12));
    }
}
