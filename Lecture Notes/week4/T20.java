//he Iterator interface is part of the java.util package 
//and is used to traverse elements of a collection (like ArrayList, HashSet, etc.)
//Iterator is a unidirectional cursor (moves only forward).
//You can only iterate once through the collection using a single iterator.
//listIterator

import java.util.*;

public class T20 {
    public static void main(String[] args) {
        //List is an interface and it implements from Collections
        //ArrayList is a class implemnts List
        //collections generic
        List<String> names = new ArrayList<>();
        //String[] names={"Harry", "Ron", "Tom"};
        names.add("Harry");
        names.add("Cedric");
        names.add("Ron");

        Iterator<String> it = names.iterator();
        for(String s:names){
            
        }
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
    }
}

//collection interface implements iterator
//List
//class-ArrayList implements List
