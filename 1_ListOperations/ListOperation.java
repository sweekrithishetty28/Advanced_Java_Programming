/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations with different functions directed as
follows 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/

package Program_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class ListOperation {
public static void main(String[] args) {
        
        // Creating an ArrayList and a LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding initial elements to both lists
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // 2. Adding an element at a specific index (index 1)
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");

        // 3. Adding multiple elements using addAll()
        arrayList.addAll(Arrays.asList("Mango", "Pineapple"));
        linkedList.addAll(Arrays.asList("Mango", "Pineapple"));

        // 4. Accessing elements using get(index)
        System.out.println("ArrayList element at index 2: " + arrayList.get(2));
        System.out.println("LinkedList element at index 2: " + linkedList.get(2));

        // 5. Updating elements using set(index, value)
        arrayList.set(2, "Kiwi");
        linkedList.set(2, "Kiwi");

        // 6. Removing element by value
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching for an element using contains()
        System.out.println("ArrayList contains Mango: " + arrayList.contains("Mango"));
        System.out.println("LinkedList contains Mango: " + linkedList.contains("Mango"));

        // 8. Getting the size of each list
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over the lists using for-each loop
        System.out.println("ArrayList elements:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("LinkedList elements:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 10. Iterating using Iterator
        System.out.println("ArrayList using Iterator:");
        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("LinkedList using Iterator:");
        Iterator<String> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        // 11. Sorting the lists using Collections.sort()
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Creating sublists (from index 1 to 3 inclusive of start, exclusive of end)
        System.out.println("Sublist of ArrayList (index 1 to 4): " + arrayList.subList(1, 4));
        System.out.println("Sublist of LinkedList (index 1 to 4): " + linkedList.subList(1, 4));

        // 13. Clearing both lists using clear()
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clear: " + arrayList);
        System.out.println("LinkedList after clear: " + linkedList);
    }
}
