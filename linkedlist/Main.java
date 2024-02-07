package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Avocado"));
        fruitList.add(new Fruit("Strawberry"));

        System.out.println("Fruit list: ");
        printList(fruitList);

        System.out.println("----------------------------------------------------------");

        fruitList.add(0,new Fruit("Mango"));
        fruitList.add(fruitList.size(), new Fruit("Papaya"));

        System.out.println("Updated fruit list: ");
        printList(fruitList);



    }

    private static void printList(LinkedList<Fruit> fruitList) {
        for (Fruit fruit : fruitList) {
            System.out.println("Description: " + fruit.getName());
        }
    }
}
