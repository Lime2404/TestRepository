public class ObjectCallsMethod {
    String name;
    int age;

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    public static void main(String[] args) {
        ObjectCallsMethod barsik = new ObjectCallsMethod();
        barsik.age = 3;
        barsik.name = "Барсик";

        barsik.sayMeow();
        barsik.jump();

    }
}
