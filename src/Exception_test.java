public class Exception_test {
    public static void main(String[] args) {
        COVID119_TEST x = new COVID119_TEST();
        try {
            int c = x.negativeTest(2, 7);
            System.out.println(c);
        } catch (PassingAnalyzes e){
          e.printStackTrace();
        }

    }
}