package hashSet3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> aHashSet = createHashset();

        String toBeRemoved = "elemento3";

        for (String element : aHashSet) {
            if (element.equals(toBeRemoved)) {
                aHashSet.remove(element);
                break;
            }
        }

        if (aHashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet contains stuff");
        }

        aHashSet.clear();

        if (aHashSet.isEmpty()) {
            System.out.println("HashSet is empty");
        } else {
            System.out.println("HashSet contains stuff");
        }
    }

    public static HashSet<String> createHashset() {
        HashSet<String> set = new HashSet<>();
        set.add("elemento1");
        set.add("elemento2");
        set.add("elemento3");
        set.add("elemento4");
        set.add("elemento5");
        return set;
    }


}
