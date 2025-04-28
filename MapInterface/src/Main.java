import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creating an empty LinkedHashMap
        Map<String, Integer> m = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        m.put("Sweta", 10);
        m.put("Amiya", 30);
        m.put("Gusly", 20);

        // Iterating over Map
        for (Map.Entry<String,Integer > e : m.entrySet()) {

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
        }

        // System.out.println(m.get("Sweta")); --> getting the value of the key part


        // costume logic to get key based on value
        Integer targetValue = 20;
        String keyForValue = null;

        for ( Map.Entry<String,Integer> entry : m.entrySet()) {
            if (entry.getValue().equals(targetValue)){
                keyForValue = entry.getKey();
                break;
            }
        }

        if(keyForValue != null) {
            System.out.println("Key for value " + targetValue + " is: " + keyForValue);
        } else {
            System.out.println("No key found for value " + targetValue);
        }


        // Changing values
        System.out.println("Initial map is: " + m);

        // Adding new elements
        m.put( "For", 7 );
        System.out.println("Initial map is: " + m);


        // Deleting elements
        m.remove("For");
        System.out.println(m);


        int a[] = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

        // Putting all the elements in the array list
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            al.add(a[i]);
        }

        HashMap<Integer, Integer> hm = new HashMap<>();


        // counting occurrence of numbers
        for (int i = 0; i < al.size(); i++) {
            hm.putIfAbsent(al.get(i), Collections.frequency(
                    al, al.get(i)));
        }
        System.out.println(hm);
    }
}