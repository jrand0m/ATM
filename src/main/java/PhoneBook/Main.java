package PhoneBook;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<User, TreeSet<PhoneNumber>> treeMap = new TreeMap<>();

        TreeSet<PhoneNumber> phoneNumbers = new TreeSet<>();

        phoneNumbers.add(new PhoneNumber("home number", 8900988));
        phoneNumbers.add(new PhoneNumber("work number", 324874386));
        phoneNumbers.add(new PhoneNumber("fax", 87687342));
        phoneNumbers.add(new PhoneNumber("cell phone", 21676));

        treeMap.put(new User("Ivan", "Travkin"), phoneNumbers);

        //System.out.println(treeMap);


        Set<Map.Entry<User, TreeSet<PhoneNumber>>> entries = treeMap.entrySet();
        // System.out.println("entries "+entries);
        Iterator<Map.Entry<User, TreeSet<PhoneNumber>>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<User, TreeSet<PhoneNumber>> next = iterator.next();
            Iterator<PhoneNumber> iterator1 = next.getValue().iterator();
            while (iterator1.hasNext()) {
                PhoneNumber next1 = iterator1.next();
                if (next1.getTypeOfNumber().equals("cell phone")) {
                    iterator1.remove();
                }
            }

        }

        System.out.println(treeMap);


    }


}
