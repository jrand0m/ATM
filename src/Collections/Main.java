package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

                      //Array List

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(0,0);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next == 0){
                iterator.remove();
            }
        }
        list.removeIf(next -> next == 0);// Сокращённый вариант.
        System.out.println(list);


               //Array List and create object inside


        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger(0,"Peter"));
        passengers.add(new Passenger(3,"Steve"));
        passengers.add(new Passenger(2,"Mike"));
        passengers.add(new Passenger(1,"Sam"));
        passengers.add(new Passenger(5,"Joe"));
        passengers.add(new Passenger(4,"Jim"));

        Collections.sort(passengers);
        System.out.println(passengers);//Сортировка по возрастанию

        CompPassengersName compPassengersName = new CompPassengersName();
        passengers.sort(compPassengersName);
        System.out.println(passengers);//Сортировка по алфавиту

//
//        for (Passenger passenger : passengers) {
//            if (passenger.equals("Steve"){
//                passengers.remove(passenger);
//
//            }
//
//        }
        System.out.println(passengers);



                                        //Set - (HashSet/LinkedSet/TreeSet)
        //Has hSet

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet);//Выводит значение по порядку и не принимает повторные значения.

        //Linked Hash Set

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(15);
        linkedHashSet.add(12);
        linkedHashSet.add(13);
        linkedHashSet.add(122);
        linkedHashSet.add(11);
        System.out.println(linkedHashSet); //Выводит так, как записали, не сортирует по порядку.

        //Tree Set

        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);

        CompPassengersName compPassengersName1 = new CompPassengersName();
        //Для сортировки по имени, в классе CompPassengersName - return passenger1.name.compareTo(passenger2.name);
        TreeSet<Passenger> passenger = new TreeSet<>(compPassengersName1);

        passenger.add(new Passenger(12,"Viktor"));
        passenger.add(new Passenger(26,"Pavel"));
        passenger.add(new Passenger(10,"Oleksandr"));
        System.out.println(passenger);//Сортирует по Айди, так как в методе класса Passenger - return this.id - passenger.id;


                                            //MAP - (HashMap/TreeMap/SortedMap)


    //HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"a");
        hashMap.put(1,"a");
        hashMap.put(4,"a");
        hashMap.put(6,"a");
        hashMap.put(5,"as");
        hashMap.put(3,"a");
        System.out.println(hashMap);//Выводит в рандомном порядке
        //LinkedHashMap сортирует по порядку от меньшего к большему.
        //TreeMap сортирует по порядку от меньшего к большему.

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();  //hashMap.entrySet() - Alt+enter// entries - just name
        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();//entries.iterator() - Alt + enter //iterator - just name
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> next = iterator1.next();//iterator1.next() - Alt + enter
            if (next.getValue().equals("as")){
                iterator1.remove();
            }
        }
        System.out.println(hashMap);


    }
}
