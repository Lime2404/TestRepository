public class OverLoading {
    // поскольку конструктор тоже метод, то мы попробуем перегрузить конструктор

    int payment;
    public OverLoading(int...payments){
        for(int payment : payments){
            System.out.println("Ваща зарплата " + payment); // программа смогда в теле коструктора выполнить коменду, пожтому конструктор - метод
        }
    }
    public static void main(String[] arg){
        OverLoading method = new OverLoading(5, 6, 7, 8, 9, 10);

    }
}
