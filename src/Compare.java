public class Compare {
    int a;
    int b;
public static int compare(int a, int b) {
int x = Integer.valueOf(a).compareTo(Integer.valueOf(b));
//    compare работает только с числовыми данными
    // возвращает +1 / 0 / -1
    return x;
}
    public static void main(String[] args) {
//        compare(4, 3);
        System.out.println(compare(100, 100));
    }
}
