import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Classname: Main
 *
 * @version     17 June 2020
 * @author      Klymenko Sergij, ONPU
 *
 *  Module 3, task 1. JavaCollectionsFramework. List.
 *
 * 1. Create ArrayList and LinkedList containing 10 000 Integer elements. Compare time intervals.
 * 2. Insert new 100 elements on the beginning, on the middle and on the end of ones. Compare time intervals.
 * 3. Update 100 elements from the beginning, from the middle and from the end of ones. Compare time intervals.
 * 4. Delete 100 elements from the beginning, from the middle and from the end of ones. Compare time intervals.
 *
 * */

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//100000 elements ArrayList
        System.out.println("//--------ArrayList Initialization with 100000 el---------//");
        LocalDateTime start1 = LocalDateTime.now();
        for (int i = 0; i<100000; i++){
            list1.add(i);
        }
        LocalDateTime finish1 = LocalDateTime.now();
        System.out.println(start1);
        System.out.println(finish1);
        System.out.println("ArrayList initialization takes "
                + ChronoUnit.MILLIS.between(start1, finish1) + " ms");

//100000 elements LinkedList
        System.out.println("//--------LinkedList Initialization with 100000 el---------//");
        LocalDateTime start2 = LocalDateTime.now();
        for (int i = 0; i<100000; i++){
            list2.add(i);
        }
        LocalDateTime finish2 = LocalDateTime.now();
        System.out.println(start2);
        System.out.println(finish2);
        System.out.println("LinkedList initialization takes "
                + ChronoUnit.MILLIS.between(start2, finish2) + " ms");


//1000 new elements inserted into ArrayList
        System.out.println("\n//--------Inserting 3000 el into ArrayList---------//");
        LocalDateTime start3 = LocalDateTime.now();
//inserting 1000 elements into the beginning of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.add(0,i);
        }
//inserting 1000 elements into the middle of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.add(list1.size()/2,i);
        }
//inserting 1000 elements into the end of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.add(i);
        }
        LocalDateTime finish3 = LocalDateTime.now();
        System.out.println(start3);
        System.out.println(finish3);
        System.out.println("Inserting 3000 elements into ArrayList takes "
                + ChronoUnit.MILLIS.between(start3, finish3) + " ms");

//1000 new elements inserted into LinkedList
        System.out.println("//--------Inserting 3000 el into LinkedList---------//");
        LocalDateTime start4 = LocalDateTime.now();
//inserting 1000 elements into the beginning of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.add(0,i);
        }
//inserting 1000 elements into the middle of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.add(list2.size()/2,i);
        }
//inserting 1000 elements into the end of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.add(i);
        }
        LocalDateTime finish4 = LocalDateTime.now();
        System.out.println(start4);
        System.out.println(finish4);
        System.out.println("Inserting 3000 elements into LinkedList takes "
                + ChronoUnit.MILLIS.between(start4, finish4) + " ms");


//1000 updated elements in ArrayList
        System.out.println("\n//--------Updating 3000 el in ArrayList---------//");
        LocalDateTime start5 = LocalDateTime.now();
//updating 1000 first elements in the beginning of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.set(0,i);
        }
//updating 1000 elements in the middle of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.set(list1.size()/2,i);
        }
//updating 1000 last elements in the end of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.set(list1.size()-1000,i);
        }
        LocalDateTime finish5 = LocalDateTime.now();
        System.out.println(start5);
        System.out.println(finish5);
        System.out.println("Updating 3000 elements in ArrayList takes "
                + ChronoUnit.MILLIS.between(start5, finish5) + " ms");

//1000 updated elements in LinkedList
        System.out.println("//--------Updating 3000 el in LinkedList---------//");
        LocalDateTime start6 = LocalDateTime.now();
//updating 1000 first elements in the beginning of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.set(0,i);
        }
//updating 1000 elements in the middle of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.set(list2.size()/2,i);
        }
//updating 1000 last elements in the end of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.set(list2.size()-1000,i);
        }
        LocalDateTime finish6 = LocalDateTime.now();
        System.out.println(start6);
        System.out.println(finish6);
        System.out.println("Updating 3000 elements in LinkedList takes "
                + ChronoUnit.MILLIS.between(start6, finish6) + " ms");


//1000 elements deleted from ArrayList
        System.out.println("\n//--------Deleting 3000 el in ArrayList---------//");
        LocalDateTime start7 = LocalDateTime.now();
//deleting 1000 first elements in the beginning of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.remove(0);
        }
//deleting 1000 elements in the middle of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.remove(list1.size()/2);
        }
//deleting 1000 last elements in the end of the ArrayList
        for (int i = 0; i<1000; i++){
            list1.remove(list1.size()-1000);
        }
        LocalDateTime finish7 = LocalDateTime.now();
        System.out.println(start7);
        System.out.println(finish7);
        System.out.println("Deleting 3000 elements in ArrayList takes "
                + ChronoUnit.MILLIS.between(start7, finish7) + " ms");

//1000 elements deleted from LinkedList
        System.out.println("//--------Deleting 3000 el in LinkedList---------//");
        LocalDateTime start8 = LocalDateTime.now();
//deleting 1000 first elements in the beginning of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.add(i,0);
        }
//deleting 1000 elements in the middle of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.add(i,list2.size()/2);
        }
//deleting 1000 last elements in the end of the LinkedList
        for (int i = 0; i<1000; i++){
            list2.remove(list1.size()-1000);
        }
        LocalDateTime finish8 = LocalDateTime.now();
        System.out.println(start8);
        System.out.println(finish8);
        System.out.println("Deleting 3000 elements in LinkedList takes "
                + ChronoUnit.MILLIS.between(start8, finish8) + " ms");

    }
}
