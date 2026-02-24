* Collection in Java?

👉 Collection means a group of objects.
In Java, the Collection Framework helps us store and manage data easily.

Example:
Instead of storing 100 variables, we store them inside a collection like ArrayList.

🔹 Main Types of Collections

- There are 3 important interfaces:

i]   List – Allows duplicates, maintains order

ii]  Set – No duplicates

iii] Map – Stores key-value pairs


1️⃣ List (ArrayList Example)

✔ Allows duplicate values
✔ Maintains insertion order

import java.util.*;

Example : public class ListExample {
          public static void main(String[] args) {
          ArrayList<String> names = new ArrayList<>();

          names.add("Yuvi");
          names.add("Babloo");
          names.add("Yuvi");  // Duplicate allowed

          System.out.println(names);
    }


2️⃣ Set (HashSet Example)

✔ Does NOT allow duplicates
✔ Order is not guaranteed

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Yuvi");
        names.add("Babloo");
        names.add("Yuvi");  // Duplicate not allowed

        System.out.println(names);
    }
}


3️⃣ Map (HashMap Example)

✔ Stores data in key-value format
✔ Keys must be unique

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Yuvi");
        students.put(2, "Babloo");

        System.out.println(students);
    }
}


| Feature    | List  | Set  | Map       |
| ---------- | ----- | ---- | --------- |
| Duplicates | ✅ Yes | ❌ No | ❌ Keys No |
| Order      | ✅ Yes | ❌ No | ❌ No      |
| Index      | ✅ Yes | ❌ No | ❌ No      |
