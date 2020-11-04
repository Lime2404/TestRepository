public class Comparison {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код

        if(a < c && a < d)
            return a;
        if(b < d && b < c)
            return b;
        if(c < d)
            return c;
        if(a < b && b < a)
            return min(a,b);
        else
            return d;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if(a < b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

