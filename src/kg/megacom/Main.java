package kg.megacom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

        public static void main(String[] args) {


            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < 5_000_000; i++) {
                arrayList.add(i);
            }

            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < 5_000_000; i++) {
                linkedList.add(i);
            }



            System.out.println("Add all method with ArrayList: " + addAllWithArrayList(arrayList));
            System.out.println("Add all method with LinkedList: " + addAllWithLinkedList(arrayList));
            System.out.println("---------------------------------------");
            System.out.println("Getting the element from ArrayList: " + getTheElementWithList(arrayList));
            System.out.println("Getting the element from LinkedList: " + getTheElementWithList(linkedList));
            System.out.println("---------------------------------------");
            System.out.println("Insert the item into the middle of an ArrayList: " + insertItemWithList(arrayList));
            System.out.println("Insert the item into the middle of a LinkedList: " + insertItemWithList(linkedList));
            System.out.println("---------------------------------------");
            System.out.println("Checking the element of an ArrayList(with <contains>): " + checkingTheElementOfList(arrayList));
            System.out.println("Checking the element of a LinkedList(with <contains>): " + checkingTheElementOfList(linkedList));
            System.out.println("---------------------------------------");
            System.out.println("Adding first element into ArrayList: " + addFirstIntoList(new ArrayList()));
            System.out.println("Adding first element into LinkedList: " + addFirstIntoList(new LinkedList()));
        }

    public static long addAllWithArrayList(List list) {
            ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        arrayList.addAll(list);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long addAllWithLinkedList(List list) {
            LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();

        linkedList.addAll(list);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }




    public static long getTheElementWithList(List list) {

        long startTime = System.currentTimeMillis();

        list.get(3_500_000);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }





    public static long insertItemWithList(List list) {

        long startTime = System.currentTimeMillis();

        list.set(4_500_000, 768);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }




    public static long checkingTheElementOfList(List list) {

        long startTime = System.currentTimeMillis();

        list.contains(4_000_005);

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }






    public static long addFirstIntoList(List list) {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            list.add(0, new Object());
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}