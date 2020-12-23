public class Responsibilities {

    public static void main(String[] args) {

        Person list1[] = new Person[4];
        list1[0] = new Man("Данил");
        list1[1] = new Women("Лиза");
        list1[2] = new Man("папа");
        list1[3] = new Women("мама");

        for (Person p : list1){
            p.work(9);
        }

        Gender list2[] = new Gender[4];
        list2[0] = new Man("Данил");
        list2[1] = new Women("Лиза");
        list2[2] = new Man("папа");
        list2[3] = new Women("мама");

        for (Gender p : list2){
            p.excercise(8);
        }

    }
}
