public class Women extends Person implements Gender{

    public Women(String name) {
        super(name);
    }
        void work(int hours){
            System.out.println("Данный человек не должен работать " + hours);
        }
        public boolean excercise(int kilos){
        System.out.println("Этот человек должен поднимать менее " + kilos + " килограмм");
        return true;
        }
}
