public class Registration {
    String name;
    int age;
    String homeCountry;
    static int count = 0;                       // Static тут невероятно критчно

    public Registration(String name, int age){
        this.name = name;
        this.age = age;

    }
    public Registration(){
        count++;
        this.name = "количество незарегистрирвоанных " ;

    }

    public static void main(String[] args){
        Registration legal = new Registration("Aibek ", 24);
        System.out.println("Зарегистрирован " + legal.name + "возраст " + legal.age);

        int i = 10;
        while(i>0){
            Registration illegal = new Registration();
            i--;
  //          System.out.println(illegal.name);
        }
        System.out.println("Не Зарегистрированно " + count);
    }
}
