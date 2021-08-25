package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * There is a Cat class with a String variable name, int variable age.
 * <p>
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 * <p>
 * Get a Set of all cats from the Map and display it on the screen.
 * <p>
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task2 {
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        Map<Integer, Cat> m = t2.createMap();
        Set<Cat> s = t2.convertMapToSet(m);
        t2.printCats(s);
    }

    public Map<Integer, Cat> createMap() {
        //write your code here
        Map<Integer, Cat> m = new HashMap<>();
        m.put(1, new Cat("Mèo1", 11));
        m.put(2, new Cat("Mèo2", 12));
        m.put(3, new Cat("Mèo3", 13));
        m.put(4, new Cat("Mèo4", 14));
        m.put(5, new Cat("Mèo5", 15));
        m.put(6, new Cat("Mèo6", 16));
        m.put(7, new Cat("Mèo7", 17));
        m.put(8, new Cat("Mèo8", 18));
        m.put(9, new Cat("Mèo9", 19));
        m.put(10, new Cat("Mèo10", 20));

        return m;

    }

    public Set<Cat> convertMapToSet(Map<Integer, Cat> map) {
        //write your code here
        Set<Cat> valueSet = new HashSet<Cat>(map.values());
        return valueSet;
    }

    public void printCats(Set<Cat> cats) {
        //write your code here
        for (Cat c : cats) {
            System.out.println(c.toString());
        }
    }

    public class Cat {
        //write your code here
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return ("Tên: " + name + ", tuổi: " + age);
        }
    }
}
