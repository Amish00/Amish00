package CollectionFramework.Hashmap;

import java.util.HashMap;

public class HashMapExample {

    public void displayHashMap(){
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1,"Virinchi");
        hashMap.put(2,"NCCS");
        hashMap.put(3,"KIST");
        hashMap.put(4,"NCIT");

        System.out.println("After adding data in hashmap: " + hashMap);

        hashMap.remove(1,"Virinchi");

        System.out.println("After Removing data in hashmap: " + hashMap);

        hashMap.replace(2,"NMB");

        System.out.println("After replacing the data in hashmap: " + hashMap);
    }
}
