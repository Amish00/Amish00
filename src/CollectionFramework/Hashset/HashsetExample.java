package CollectionFramework.Hashset;

import java.util.HashSet;

public class HashsetExample {
    public void displayHasSet(){

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Virinchi");
        hashSet.add("Kist");
        hashSet.add("Nccs");

        System.out.println("After adding to hashset: " + hashSet);

        hashSet.remove("Kist");

        System.out.println("After Removing from hashset: " + hashSet);

    }
}
