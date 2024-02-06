package hashSet2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println(carSet().contains("Opel"));

    }

    private static HashSet<String> carSet() {
        HashSet<String> cars = new HashSet<>();
        cars.add("Opel");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Dacia");
        return cars;


    }
}
