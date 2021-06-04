public class Constructor_V_constructore {


        public double x;
        public double y;
        public double radius;

        public Constructor_V_constructore(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Constructor_V_constructore(double x, double y) {
            //напишите тут ваш код
//            this.x = x;
//            this.y = y;
//            this.radius = 10;
            this(x, y, 10); // вызов первого конструктора

        }

        public Constructor_V_constructore() {
            this(5, 5, 1);
        }

        public static void main(String[] args) {
            Constructor_V_constructore circle = new Constructor_V_constructore();
            System.out.println(circle.x + " " + circle.y + " " + circle.radius);
            Constructor_V_constructore anotherCircle = new Constructor_V_constructore(10, 5);
            System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
        }

}
