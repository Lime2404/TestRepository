import java.util.HashMap;
import java.util.Map;

public class Map_Map_to_Map {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> map1 = new HashMap<>();
//        for(int i = 0; i < cats.length; i++){
//            map.put(cats[i], new Cat(cats[i]));
//        }
        for(String strings : cats){
            map1.put(strings, new Cat(strings));
        }
        return map1;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }

}
