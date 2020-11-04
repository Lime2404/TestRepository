
public class Enumchik{
    enum Test {
        LOW,
        MEDIUM,
        HIGH
    }

  public static void main(String[] args){
        Test var1 = Test.MEDIUM;
        System.out.println(var1);
        for(Test var2 : Test.values()){
            System.out.println(var2);
        }
    }
}

