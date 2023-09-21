// Map: Key is unique, like HashSet. Values doesnt need to be unique, it like a List

import java.util.HashMap;
import java.util.Map;

class MapJ{
    public static void main(String[] args) {
        
        Map<String, Integer> students = new HashMap<>();

        students.put("jk", 49);
        students.put("eh", 58);
        students.put("sq", 21);
        students.put("pl", 89);

        students.put("eh", 67); // will only update the value for the existing key

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.get("eh"));
    }
}