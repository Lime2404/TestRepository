public class Responsibilities {

    public static void main(String[] args) {

//        Person list[] = new Person[4];
//        list[0] = new Man("Данил");
//        list[1] = new Women("Лиза");
//        list[2] = new Man("папа");
//        list[3] = new Women("мама");

//        for (Person p : list){
//            p.work(9);
//        }

        Gender list[] = new Gender[4];
        list[0] = new Man("Данил");
        list[1] = new Women("Лиза");
        list[2] = new Man("папа");
        list[3] = new Women("мама");

        for (Gender p : list){
            p.excercise(8);
        }

    }
}
