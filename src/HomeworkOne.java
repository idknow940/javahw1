public class HomeworkOne {
    public static void main(String[] args) {
        double a = 4, b = -8, c = 16, d = -32;
        // 21 //
        System.out.println("21");
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        // 22 //
        System.out.println("22");
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        // 23 //
        System.out.println("23");
        boolean equalToOne = true;
        if (a == 1 || b == 1 || c == 1) {
            System.out.println(equalToOne);
        } else {
            System.out.println(!equalToOne);
        }
        // 24 //
        System.out.println("24");
        boolean equalToTwo = true;
        if ((a == 2 && b == 2) || (a == 2 && c == 2) || (b == 2 && c == 2)) {
            System.out.println(equalToTwo);
        } else {
            System.out.println(!equalToTwo);
        }
        // 25 //
        System.out.println("25");
        int y = 0;
        if (a + b > c && b + c > a && a + c > b) {
            y = 1;
        } else {
            y = 2;
        }
        System.out.println("y=" + y);
        // 26 //
        System.out.println("26");
        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        // 27 //
        System.out.println("27");
        boolean progressionBool = true;
        if (c - b == b - a) {
            System.out.println(progressionBool);
        } else {
            System.out.println(!progressionBool);
        }
        // 28 //
        System.out.println("28");
        boolean geoProgressionBool = true;
        if (c != 0 && b != 0 && a != 0) {
            if (c / b == b / a) {
                System.out.println(geoProgressionBool);
            } else {
                System.out.println(!geoProgressionBool);
            }
        } else {
            System.out.println("One of the numbers might be 0");
        }
        // 29 //
        System.out.println("29");
        if (a < b && b < c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && c < b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b < a && a < c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b < c && c < a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c < b && b < a) {
            System.out.println(c + " " + b + " " + a);
        } else if (c < a && a < b) {
            System.out.println(c + " " + a + " " + b);
        }
        // 30 //
        System.out.println("30");
        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a > c && c > b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b > a && a > c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b > c && c > a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > b && b > a) {
            System.out.println(c + " " + b + " " + a);
        } else if (c > a && a > b) {
            System.out.println(c + " " + a + " " + b);
        }
        // 31 //
        System.out.println("31");
        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
        // 32 //
        System.out.println("32");
        if (a < b && a < c && a < d) {
            System.out.println(a);
        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
        // 33 //
        System.out.println("33");
        if (a == 1 || b == 1 || c == 1 || d == 1) {
            System.out.println(equalToOne);
        } else {
            System.out.println(!equalToOne);
        }
        // 34 //
        System.out.println("34");
        if (a + b == c + d && a + c == d + b && a + d == c + b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // 35 //
        System.out.println("35");
        if (a == b + c + d || b == a + c + d || c == a + d + b || d == a + b + c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // 36 //
        System.out.println("36");
        int oddCount = 0;
        if (!(a % 2 == 0)) {
            oddCount++;
        } else if (!(b % 2 == 0)) {
            oddCount++;
        } else if (!(c % 2 == 0)) {
            oddCount++;
        } else if (!(d % 2 == 0)) {
            oddCount++;
        }
        if (oddCount >= 2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        // 37 //
        System.out.println("37");
        if (d - c == c - b && c - b == b - a) {
            System.out.println(progressionBool);
        } else {
            System.out.println(!progressionBool);
        }
        // 38 //
        System.out.println("38");
        if (d / c == c / b && c / b == b / a) {
            System.out.println(geoProgressionBool);
        } else {
            System.out.println(!geoProgressionBool);
        }
        // 39 //
        System.out.println("39");
        if (a < b && b < c && c < d) {
            System.out.println(a + " " + b + " " + c + " " + d);
        } else if (a < c && c < b && b < d) {
            System.out.println(a + " " + c + " " + b + " " + d);
        } else if (a < c && c < d && d < b) {
            System.out.println(a + " " + c + " " + d + " " + b);
        } else if (a < b && b < d && d < c) {
            System.out.println(a + " " + b + " " + d + " " + c);
        } else if (a < d && d < b && b < c) {
            System.out.println(a + " " + d + " " + b + " " + c);
        } else if (a < d && d < c && c < b) {
            System.out.println(a + " " + d + " " + c + " " + b);
        } else if (b < a && a < c && c < d) {
            System.out.println(b + " " + a + " " + c + " " + d);
        } else if (b < a && a < d && d < c) {
            System.out.println(b + " " + a + " " + d + " " + c);
        } else if (b < c && c < a && a < d) {
            System.out.println(b + " " + c + " " + a + " " + d);
        } else if (b < c && c < d && d < a) {
            System.out.println(b + " " + c + " " + d + " " + a);
        } else if (b < d && d < a && a < c) {
            System.out.println(b + " " + d + " " + a + " " + c);
        } else if (b < d && d < c && c < a) {
            System.out.println(b + " " + d + " " + c + " " + a);
        } else if (c < b && b < a && a < d) {
            System.out.println(c + " " + b + " " + a + " " + d);
        } else if (c < b && b < d && d < a) {
            System.out.println(c + " " + b + " " + d + " " + a);
        } else if (c < a && a < b && b < d) {
            System.out.println(c + " " + a + " " + b + " " + d);
        } else if (c < a && a < d && d < b) {
            System.out.println(c + " " + a + " " + d + " " + b);
        } else if (c < d && d < b && b < a) {
            System.out.println(c + " " + d + " " + b + " " + a);
        } else if (c < d && d < a && a < b) {
            System.out.println(c + " " + d + " " + a + " " + b);
        } else if (d < b && b < a && a < c) {
            System.out.println(d + " " + b + " " + a + " " + c);
        } else if (d < b && b < c && c < a) {
            System.out.println(d + " " + b + " " + c + " " + a);
        } else if (d < a && a < b && b < c) {
            System.out.println(d + " " + a + " " + b + " " + d);
        } else if (d < a && a < c && c < b) {
            System.out.println(d + " " + a + " " + c + " " + b);
        } else if (d < c && c < b && b < a) {
            System.out.println(d + " " + c + " " + b + " " + a);
        } else if (d < c && c < a && a < b) {
            System.out.println(d + " " + c + " " + a + " " + b);
        }

        // 40 //
        System.out.println("40");
        if (a > b && b > c && c > d) {
            System.out.println(a + " " + b + " " + c + " " + d);
        } else if (a > c && c > b && b > d) {
            System.out.println(a + " " + c + " " + b + " " + d);
        } else if (a > c && c > d && d > b) {
            System.out.println(a + " " + c + " " + d + " " + b);
        } else if (a > b && b > d && d > c) {
            System.out.println(a + " " + b + " " + d + " " + c);
        } else if (a > d && d > b && b > c) {
            System.out.println(a + " " + d + " " + b + " " + c);
        } else if (a > d && d > c && c > b) {
            System.out.println(a + " " + d + " " + c + " " + b);
        } else if (b > a && a > c && c > d) {
            System.out.println(b + " " + a + " " + c + " " + d);
        } else if (b > a && a > d && d > c) {
            System.out.println(b + " " + a + " " + d + " " + c);
        } else if (b > c && c > a && a > d) {
            System.out.println(b + " " + c + " " + a + " " + d);
        } else if (b > c && c > d && d > a) {
            System.out.println(b + " " + c + " " + d + " " + a);
        } else if (b > d && d > a && a > c) {
            System.out.println(b + " " + d + " " + a + " " + c);
        } else if (b > d && d > c && c > a) {
            System.out.println(b + " " + d + " " + c + " " + a);
        } else if (c > b && b > a && a > d) {
            System.out.println(c + " " + b + " " + a + " " + d);
        } else if (c > b && b > d && d > a) {
            System.out.println(c + " " + b + " " + d + " " + a);
        } else if (c > a && a > b && b > d) {
            System.out.println(c + " " + a + " " + b + " " + d);
        } else if (c > a && a > d && d > b) {
            System.out.println(c + " " + a + " " + d + " " + b);
        } else if (c > d && d > b && b > a) {
            System.out.println(c + " " + d + " " + b + " " + a);
        } else if (c > d && d > a && a > b) {
            System.out.println(c + " " + d + " " + a + " " + b);
        } else if (d > b && b > a && a > c) {
            System.out.println(d + " " + b + " " + a + " " + c);
        } else if (d > b && b > c && c > a) {
            System.out.println(d + " " + b + " " + c + " " + a);
        } else if (d > a && a > b && b > c) {
            System.out.println(d + " " + a + " " + b + " " + d);
        } else if (d > a && a > c && c > b) {
            System.out.println(d + " " + a + " " + c + " " + b);
        } else if (d > c && c > b && b > a) {
            System.out.println(d + " " + c + " " + b + " " + a);
        } else if (d > c && c > a && a > b) {
            System.out.println(d + " " + c + " " + a + " " + b);
        }
    }
}
