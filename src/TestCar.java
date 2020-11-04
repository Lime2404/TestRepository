public class TestCar {
    public static void main(String[] args) {

        Car bmw = new Car();  // in the memory java creates the object with the link bmw to this place of JVM memory
        bmw.colour = "blue";
        bmw.doors = 4;
        bmw.wheels = 4;
        System.out.println(bmw.colour);
            System.out.println(bmw.wheels);
    }
}
