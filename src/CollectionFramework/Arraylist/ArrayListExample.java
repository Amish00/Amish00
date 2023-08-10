package CollectionFramework.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

        public void displayList() {
            ArrayList <String> list = new ArrayList<String>();
            System.out.println("Before adding to arraylist: " + list);
            System.out.println();
            list.add("Virinchi");
            list.add("Kist");
            list.add("NCCS");
            System.out.println("After adding array list: "+list);
            System.out.println();

            System.out.println("returning element" + list.get(1));
            list.set(1,"Nist");

            for (String s : list) {
                System.out.println(s);
            }
            System.out.println();
            System.out.println(list.contains("Nist \n"));
            System.out.println(list.remove("Virinchi"));
            System.out.println("After updating "+list);


            Collections.sort(list);
            System.out.println("After sorting in Ascending order: "+ list);
        }
    }
