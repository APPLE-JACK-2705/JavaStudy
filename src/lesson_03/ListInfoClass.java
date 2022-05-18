package lesson_03;

import java.util.*;

public class ListInfoClass {
    public static void main(String[] args) {
        // ArrayList
//        ArrayList<String> list = new ArrayList<>();
//        list.add("10");
//        list.add("20");
//        list.add("30");
//        list.remove(1);
//        list.set(1, "40");
//        list.add("30");
//        System.out.println(list);
//        System.out.println(list.size());

        List<Gerbil> listGerbil = new ArrayList<>();
        listGerbil.add(new Gerbil(1));
        listGerbil.add(new Gerbil(2));
        listGerbil.add(new Gerbil(3));
        listGerbil.add(new Gerbil(4));

        for (int i = 0; i < listGerbil.size(); i++) {
            System.out.println(listGerbil.get(i).hop());
        }

        // LinkedList
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("first");
//        linkedList.add("second");
//        linkedList.add("third");
//        linkedList.add("fourth");
//        System.out.println(linkedList);
//        linkedList.remove();
//        System.out.println(linkedList);
//        linkedList.addFirst("first");
//        linkedList.addLast("fifth");
//        System.out.println(linkedList);
//        String firstElement = linkedList.getFirst();
//        char[] charArray = firstElement.toCharArray();
//        System.out.println("Char array: ");
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println("Element [" + i + "]: " + charArray[i]);
//        }

//        ArrayList<Developer> listDeveloper = new ArrayList<>();
//        Developer developer = new Developer("Adil", "java", 1000);
//        listDeveloper.add(developer);
//        listDeveloper.add(new Developer("Askhat", "python", 3000));
//        listDeveloper.add(new Developer("Ruslan", "java", 2000));
//        listDeveloper.add(null);
//        listDeveloper.add(new Developer("Dias", "c++", 5000));
//        listDeveloper.add(developer);
//        listDeveloper.add(new Developer("Marzhan", "react", 4500));

//        for (int i = 0; i < listDeveloper.size(); i++) {
//            if (developer.equals(listDeveloper.get(i))){
//                listDeveloper.remove(listDeveloper.get(i));
//            }
//        }

//        Iterator<Developer> iterator = listDeveloper.iterator();
//        while(iterator.hasNext()){
//            if(developer.equals(iterator.next())){
//                iterator.remove();
//            }
//        }
//
//        for (Developer d : listDeveloper){
//            System.out.println(d);
//        }


//        for (Developer d : listDeveloper){
//            if (developer.equals(d)){
//                listDeveloper.remove(d);
//            }
//        }

        // Map
//        Developer dev = new Developer("0", "java", 3000);
//        Developer dev1 = new Developer("1", "c++", 4000);
//        Developer dev2 = new Developer("2", "python", 2000);
//        Map<Developer, String> map = new HashMap<>();
//        map.put(dev, dev.getName());
//        map.put(dev1, dev1.getName());
//        map.put(dev2, dev2.getName());
//        map.put(new Developer("1", "c++", 4000), "svsdvsvs");
//
//        for (Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

        // Set


    }
}
