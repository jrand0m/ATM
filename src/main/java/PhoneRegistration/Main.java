package PhoneRegistration;

import java.io.IOException;
import java.util.*;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    private static final TreeMap<User, HashSet<Contact>> usersMap = new TreeMap<>();

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        TreeMap<User, HashSet<Contact>> map = new TreeMap<>();
//        map = addNewUser(map,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()) ;
//        System.out.println(map);
//        map = addNewContact(map, scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
//        System.out.println(map);
//        map = deleteContact(map,scanner.nextLine());
//        System.out.println(map);
//        TreeMap<User, TreeSet<Contact>> treeMap = new TreeMap<>();
//        TreeSet<Contact> contacts = new TreeSet<>();
//        contacts.add(new Contact("Home number","+26848484884"));
//        contacts.add(new Contact("A number","+3808468484"));
//        contacts.add(new Contact("Mobile number","+3808468484"));
//        contacts.add(new Contact("EXT number","68484"));
//
//        treeMap.put(new User("Serhi","Danevych"), contacts);
//
////        System.out.println(treeMap);// TreMap виводить в алфавітному порядку
//
//        treeMap.entrySet();
//
//Set<Map.Entry<User,TreeSet<Contact>>> entries = treeMap.entrySet();
////        System.out.println("entries" + entries);
//        Iterator<Map.Entry<User, TreeSet<Contact>>> iterator = entries.iterator();
//        System.out.println(treeMap);
//        while (iterator.hasNext()){
//            Map.Entry<User,TreeSet<Contact>> next = iterator.next();
//            Iterator<Contact> iterator1 = next.getValue().iterator();
//            while (iterator1.hasNext()) {
//                Contact next1 = iterator1.next();
//                next1.getContactType().equals("EXT number");
//
//            }
//            if (next.getValue().equals(new Contact("A number","+3808468484")));
//            iterator1.remove();
//        }
//
//        System.out.println(treeMap);
        TreeMap<User, HashSet<Contact>> map = new TreeMap<>(); //реактивный подход.


        //ArrayList<MenuItem> menuItemsList = new ArrayList<>();
//        menuItemsList.add(new MenuItem("Add New User", 1, new Runnable() {
//            public void run() {
//                addNewUser(usersMap, "Serhii", "Danevych", "+380676756943", "Mobile");
//            }
//        }));
//
//        menuItemsList.add(new MenuItem("Add New Contact", 2, new Runnable() {
//            @Override
//            public void run() {
//                addNewContact(usersMap, "Serhii ", "Danevych", "221-50-42", "Home");
//                System.out.println(usersMap);
//            }
//        }));
//        menuItemsList.add(new MenuItem("Delete Contact", 3, new Runnable() {
//            @Override
//            public void run() {
//                deleteContact(usersMap, "+380676756943");
//            }
//        }));

//        menuPresent(menuItemsList);
//        choiceMenuItem(menuItemsList);


//        System.out.println(addNewUser(usersMap, "Serhii", "Danevych", "+380676756943", "Mobile"));
//        System.out.println(addNewContact(usersMap,"Serhii", "Danevych", "221-50-42", "Home"));
//        System.out.println(deleteContact(usersMap,"+380676756943" ));
        map = addNewUser(map, "Serhii", "Danevych", "+380676756943", "Mobile");
        System.out.println(map);
        map = addNewContact(map, "Serhii", "Danevych", "221-50-42", "Home");
        System.out.println(map);
        map = addNewContact(map, "Serhii", "Danevych", "+380679784895", "Mobile");
        System.out.println(map);
        map = deleteContact(map, "+380679784895");
        System.out.println(map);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        map = changeContact(map, "Serhii", "Danevych", "Mobile", "+380676756943", "+38888888888888");
        System.out.println(map);

    }


//    public static void choiceMenuItem(ArrayList<MenuItem> menuItemsList) {
//        while (true) {
//            System.out.println("Please make your choice: ");
//            int i = scanner.nextInt();
//            for (MenuItem menuItems : menuItemsList) {
//                if (menuItems.getPosition().equals(i)) {
//                    menuItems.runMenuItemMethod();
//                }
//
//            }
//        }
//
//    }
//
//    public static void menuPresent(ArrayList<MenuItem> menuItemsList) {
//        Collections.sort(menuItemsList);
//        for (MenuItem menuItem : menuItemsList) {
//            System.out.println(" " + menuItem.getPosition() + " " + menuItem.getCaption());
//        }
//
//
//    }


    public static TreeMap<User, HashSet<Contact>> addNewUser
            (TreeMap<User, HashSet<Contact>> map, String name, String surname, String number, String type) {
        HashSet<Contact> set = new HashSet<>();
        set.add(new Contact(type, number));
        map.put(new User(name, surname), set);
        return map;
    }


    public static TreeMap<User, HashSet<Contact>> addNewContact(TreeMap<User, HashSet<Contact>> map, String name, String surname, String number, String type) {
        for (Map.Entry<User, HashSet<Contact>> userHashSetEntry : map.entrySet()) {
            if (userHashSetEntry.getKey().getSurname().equals(surname) && userHashSetEntry.getKey().getName().equals(name)) {
                userHashSetEntry.getValue().add(new Contact(type, number));
            }
        }
        return map;
    }


    public static TreeMap<User, HashSet<Contact>> deleteContact(TreeMap<User, HashSet<Contact>> map, String number) {

        Set<Map.Entry<User, HashSet<Contact>>> entries = map.entrySet();
        Iterator<Map.Entry<User, HashSet<Contact>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<User, HashSet<Contact>> next = iterator.next();
            HashSet<Contact> hashSetValue = next.getValue();
            Iterator<Contact> iteratorHashSet = hashSetValue.iterator();
            while (iteratorHashSet.hasNext()) {//iteratorHashSet.hasNext() = true or false
                Contact nextContact = iteratorHashSet.next();
                //System.out.println(nextContact);//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! contact iter
                if (nextContact.getPhoneNumber().equals(number)) {
                    iteratorHashSet.remove();
                }
            }
        }
        return map;
    }


    public static TreeMap<User, HashSet<Contact>> changeContact
            (TreeMap<User, HashSet<Contact>> map, String name, String surname, String type, String number, String newNumber) {
        for (Map.Entry<User, HashSet<Contact>> userHashSetEntry : map.entrySet()) {
            if (userHashSetEntry.getKey().getName().equals(name) && userHashSetEntry.getKey().getSurname().equals(surname)) {
                Iterator<Contact> iterator = userHashSetEntry.getValue().iterator();
                while (iterator.hasNext()) {
                    Contact item = iterator.next();
                    System.out.println(item.getContactType());
                    if (item.getContactType().equals(type) && item.getPhoneNumber().equals(number)) {
                        item.setPhoneNumber(newNumber);
                    }
                }
            }
        }
        return map;
    }


}


//    public static TreeMap<User, HashSet<Contact>> deleteContact
//            (TreeMap<User, HashSet<Contact>> map, String surname, String type){
//        Set<Map.Entry<User, HashSet<Contact>>> entries = map.entrySet();
//        Iterator<Map.Entry<User, HashSet<Contact>>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<User, HashSet<Contact>> next = iterator.next();
//            if (next.getKey().getName().equals(surname)){
//                Iterator<Contact> iteratorContact = next.getValue().iterator();
//                while (iteratorContact.hasNext()){
//                    Contact contact = iteratorContact.next();
//                    if (contact.getContactType().equals(type)){
//                        iteratorContact.remove();
//                    }
//                }
//            }
//        }
//        return map;
//    }


