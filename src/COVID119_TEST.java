public class COVID119_TEST {
    int negativeTest(int a, int b) throws PassingAnalyzes{
       if (a > b){
           return 1;
//           throw new PassingAnalyzes ("Ай яй яй");
       }
       else
           System.out.println(b/a);
    throw new PassingAnalyzes ("Ай яй яй");   // пример кастомного exception
    }
}
