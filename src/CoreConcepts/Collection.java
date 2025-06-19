package CoreConcepts;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");

        System.out.println(names);
        System.out.println(names.get(1));

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Jane");
        set.add("Julie");
        System.out.println(set);
        System.out.println(set.contains("John"));
        System.out.println(set.contains("Julie"));

        Map<String, Integer> map = new HashMap<>();
        map.put("John", 1);
        map.put("Julie", 2);
        System.out.println(map);
        System.out.println(map.get("John"));
        System.out.println(map.get("Julie"));

    }
}
