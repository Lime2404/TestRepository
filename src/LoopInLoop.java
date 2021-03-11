public class LoopInLoop {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 10) {
            while (b <= 10) {
                System.out.print("s");
                b++;
            }
            System.out.println();
            a++;
            b=1;
        }
    }
}
