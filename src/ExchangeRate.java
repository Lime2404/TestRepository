public class ExchangeRate {
/*
Обмен валют
*/
        public static void main(String[] args) {
            //напишите тут ваш код
            System.out.println(convertEurToUsd(10, 11.17));

            System.out.println(convertEurToUsd(11, 23.44));

        }

        public static double convertEurToUsd(int eur, double exchangeRate) {
            //напишите тут ваш код

            double usd = eur * exchangeRate;
            return usd;

        }


}
