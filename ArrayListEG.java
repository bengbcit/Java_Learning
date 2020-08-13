import java.util.*;
public class ArrayListEG {
    public static void main(String[] args) {
        /*  ArrayList 
        *       1. access random items frequently
        *       2. only need to add or remove elements at the end of the list
        */
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volve");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
          }

        System.out.println();
        cars.set(0, "Opel");
        cars.remove(3);
        Collections.sort(cars);     // Import the Collections class not Collection
        for (String iString:cars){
            System.out.println(iString);
        }
        /*  LinkedList  
        *       1. only use the list by looping through it instead of accessing random items
        *       2. requently need to add and remove items from the beginning or middle of the list
        */
        LinkedList<Integer> myNumbers = new LinkedList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.addFirst(5);
        myNumbers.removeLast();
        
        for (int i : myNumbers) {
            System.out.println(i);
        }

    }
}
