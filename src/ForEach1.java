public class ForEach1 {

        public static void main (String[] args) {
            String[] friends = new String[20];
            friends[0] = "Sergey1";
            friends[1] = "Sergey2";
            friends[2] = "Nikita";
            friends[3] = "Sergey4";
            friends[19] = "Sergey5";
//            int i;
//            int totalElements = friends.length;
//
//            for (i = 0; i < totalElements; i++){
//                if (friends[i] == "Nikita")
//                continue;
//                    break;
            for (String search : friends ){

                System.out.println("I want to meet with " + search);
//            i++;
            }
            System.out.println("И тут я встретил его");
        }

}
