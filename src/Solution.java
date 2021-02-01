public class Solution {
        public static void main(String[] args) {
            displayClosestToTen(8, 11);
            displayClosestToTen(7, 14);
            displayClosestToTen(-4, -19);
        }

        public static void displayClosestToTen(int a, int b) {
            // напишите тут ваш код
            int c = 10 - abs(a);
            int d = b - 10;
            if (abs(c) > abs(d))
                System.out.println(b);
            if (abs(c) < abs(d))
                System.out.println(a);
            if (abs(c) == abs(d))
                System.out.println(a);

        }
        public static int abs(int a){
            if (a < 0) {
                return -a;
            } else {
                return a;
            }
        }
    }
