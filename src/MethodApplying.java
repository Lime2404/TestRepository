public class MethodApplying {    // учимся обявлять методы и работать с возвращаемым значением
   public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = max(a,b);
        System.out.println(c);
    }
    public static int max(int d, int e){
       int m;
       if (d > e)
           m=d;
       else m=e;
       return m;
    }
}
