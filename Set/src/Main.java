import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

       /* Set<String> hash_set = new HashSet<>();
        hash_set.add("Goran");
        hash_set.add("has");
        hash_set.add("no");
        hash_set.add("place");
        hash_set.add("to");
        hash_set.add("stay.");
        System.out.println(hash_set);

        Set<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}
        ));

        Set<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}
        ));

        // to fing union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union of the two set");
        System.out.println(union);

        System.out.println();

        // to find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference of the two Set");
        System.out.println(difference);*/

        // Adding elements to Set
        Set<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        System.out.println(hs);

        // Accessing the Element

        // Declaring a String
        String check = "D";

        // Check if the above string exists in the SortedSet
        // or not
        // using contains() method
        System.out.println("Contains " + check + " " + hs.contains(check));

        // Removing values

        hs.remove("B");
        // Printing Set elements after removing an element
        // and printing updated Set elements
        System.out.println("After removing element " + hs);


        // Iterating through the Set
        for (String value : hs)
            // Printing all the values inside the object
            System.out.print(value + ", ");
        System.out.println();
    }
}