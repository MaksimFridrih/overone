package task1;

import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) {
        Terror terror = new Terror("Maks", "Ivan");
        Terror terror1 = new Terror("Dima", "Lord");
        Terror terror2 = new Terror("Sergey", "Pupsik");
        Map<Integer, Terror> map = new HashMap<>();
        map.put(1, terror);
        map.put(2, terror1);
        map.put(3, terror2);
        System.out.println(map.get(1));
    }
}
