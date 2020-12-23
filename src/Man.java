class Man extends Person implements Gender {

    public Man(String name) {
        super(name);
    }

    void work(int hours) {
        System.out.println("Этот человек должен работать " + hours);
    }

    public boolean excercise(int kilos) {
        System.out.println("Этот человек должен поднимать более " + kilos + " килограмм");
        return true;
    }
}