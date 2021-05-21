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
            int e = murzik.hashCode();
        System.out.println(e);
        Cat Misty = new Cat("Мистие", 1);
        System.out.println(Misty.name);
        int m = Misty.hashCode();
        System.out.println(m);

        }
}


