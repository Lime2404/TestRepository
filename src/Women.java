public class Women extends Person {

    public Women(String name) {
        super(name);
    }
        void work(int hours){
            System.out.println("Данный человек не должен работать " + hours);
        }
}
