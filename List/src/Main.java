import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Creating a List of Strings using ArrayList
//        List<String> li = new ArrayList<>();
//
//        // Adding elements in List
//        li.add("Java");
//        li.add("Python");
//        li.add("DSA");
//        li.add("C++");
//
//        System.out.println("Elements of List are:");
//
//        // Iterating through the list
//        for (String s : li) {
//            System.out.println(s);
//        }
//
//        // Accessing elements
//        System.out.println("Element at Index 1: "+ li.get(1));
//
//        // Updating elements
//        li.set(1, "JavaScript");
//        System.out.println("Updated List: " + li);
//
//        // Removing elements
//        li.remove("C++");
//        System.out.println("List After Removing Element: " + li);
//
//        // Find index of element
//        int searchElement = li.indexOf("DSA");
//        System.out.println(searchElement);
//
//        // Check if present
//        boolean isPresent = li.contains("Python");
//        System.out.print("Java is Python : " + isPresent);
//
//        // For loop for iteration
//        for (int i = 0; i < li.size(); i++) {
//            System.out.print(li.get(i) + " ");
//        }

        // ArrayList
        int n = 5;
        List<Integer> arrli = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arrli.add(i);
        }
        System.out.println(arrli);

        arrli.remove(3);
        System.out.println(arrli);

        for (int i = 0; i < arrli.size(); i++) {
            System.out.print(arrli.get(i) + " ");
        }

        System.out.println();

        // Stack
        List<Integer> s = new Stack<>();
        for (int i = 1; i < n; i++) {
            s.add(i);
        }
        System.out.println(s);

        // LinkedList
        List<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add(i);
        }
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}