public abstract class Person {

    private String name;

    public Person (String name){
        this.name=name;
    }
    abstract void work(int hours);

    public String getName(){
    return "Person's name is "+ name;
    }
}
