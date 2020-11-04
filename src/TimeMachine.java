public class TimeMachine {

        public void goToFuture(int currentYear) {

            currentYear = currentYear+10;
            System.out.println("Извините, теперь вы " +currentYear);
        }

        public void goToPast(int currentYear) {

         currentYear = currentYear-10;
            System.out.println("А сейчас?");
            System.out.println(currentYear);
        }

        public static void main(String[] args) {

            TimeMachine timeMachine = new TimeMachine();
            int currentYear = 2020;

            System.out.println("Какой сейчас год?");
            System.out.println(currentYear);

           timeMachine.goToPast(currentYear);  // если не передать в метод значение,то он и не будет вызван
            System.out.println("Погоди, но я же хотел в будущее");
            timeMachine.goToFuture(currentYear);


        }
}
