public class ArrayFriends {


    public static void main (String[] args) {
        String[] friends = new String[20];
        friends[0] = "Sergey1";
        friends[1] = "Sergey2";
        friends[2] = "Sergey3";
        friends[3] = "Sergey4";
        friends[19] = "Sergey5";
        int i = 0;
        int totalElements = friends.length;
        while (i < totalElements){
            if (friends[i] == null){
                i++;
                continue;
            }
    System.out.println("I want to meet with " + friends[i]);
             i++;
      }

    }
}
