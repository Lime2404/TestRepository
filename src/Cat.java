public class Cat {
    String name;
    int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public static void main(String[] args){
            Cat murzik = new Cat("Мурзик", 5);
            System.out.println(murzik.name);
        }
}


