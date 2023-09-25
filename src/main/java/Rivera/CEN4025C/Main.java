package Rivera.CEN4025C;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

//Prerequisites: Before writing the code below, I installed JProfiler 14.0 as discussed in the Profiling with JProfiler [1] and JProfiler’s integration into IntelliJ IDEA [2] videos.


public class Main {

    public static int numLimit = 2000000;
    //Reference [8]
    public static void main(String[] args)
        {
        arrayListMethod();
        linkedListMethod();
        hashtableMethod();
        }

    public static void arrayListMethod() {
        //New method for ArrayList

        //Declaring the ArrayList
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        //Reference [3]

        //New method for random integers
        Random randNum = new Random();
        //Reference [4]

        //New upper limit integer variable for data structures

        //Appending new elements at the end of the list
        for (int i = 0; i < numLimit; i++) {
            myArray.add(randNum.nextInt());
            //System.out.println("Index: " + i + " Int value added" + " " + "Array size: " + myArray.size()); //Simple test to check for array population. Array list populates to 2mil.
        }
        //Reference [3],[4]

        //Deleting elements of the ArrayList
        for (int i = numLimit - 1; myArray.size() > 0; i--) {
            myArray.remove(i);
            //System.out.println("Index: " + i + " | Int value removed" + " | Array size: " + myArray.size() + " | Array value: " + myArray); //Simple test to check for array value deletion.
        }

        //FIXME - Element deletion stops at 1mil, when index and array size matches. Removed numLimit var and replaced with array size. (Resolved)
        //Resolution: Index must be within bounds of array. Reduced index value by 1 and changed condition statement to match.
        //FIXME - reduced numLimit from 2000000 to 2000 for troubleshooting. (Resolved)
        //Resolution: Declared global variable and reset value to 2,000,000

        //Reference [3],[5],[6]
    }

    public static void linkedListMethod() {
        //New method for LinkedList

        //Declaring the LinkedList
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        //Reference [7]

        //New method for random integers
        Random randNum = new Random();
        //Reference [4]

        //New upper limit integer variable for data structures

        //Appending new elements at the end of the list
        for (int i = 0; i < numLimit; i++) {
            myLinkedList.add(randNum.nextInt());
            //System.out.println("Index: " + i + " Int value added" + " " + "LinkedList size: " + myLinkedList.size()); //Simple test to check for LinkedList population.
        }
        //Reference [4],[7]

        //Deleting elements of the ArrayList
        for (int i = numLimit - 1; myLinkedList.size() > 0; i--) {
            myLinkedList.remove(i);
            //System.out.println("Index: " + i + " | Int value removed" + " | LinkedList size: " + myLinkedList.size() + " | LinkedList value: " + myLinkedList); //Simple test to check for LinkedList value deletion.
        }
        //Reference [5]
    }

    public static void hashtableMethod() {
        //New method for Hashtable

        //Declaring the Hashtable
        Hashtable<Integer, Integer> myHashtable = new Hashtable<>();
        //Reference [8]

        //New method for random integers
        Random randNum = new Random();
        //Reference [4]

        //New upper limit integer variable for data structures

        //Appending new elements at the end of the Hashtable
        for (int i = 0; i < numLimit; i++) {
            myHashtable.put(i, randNum.nextInt());
            //System.out.println("Index: " + i + " Int value added" + " " + "Array size: " + myHashtable.size()); //Simple test to check for Hashtable population.
        }
        //Reference [4],[8]

        //Deleting elements of the Hashtable
        for (int i = numLimit - 1; myHashtable.size() > 0; i--) {
            myHashtable.remove(i);
            //System.out.println("Index: " + i + " | Int value removed" + " | Hashtable size: " + myHashtable.size() + " | Hashtable value: " + myHashtable); //Simple test to check for LinkedList value deletion.
        }
        //Reference [8]
    }
}



/*

GitHub:
https://github.com/arivera247/CEN_4025C_Module_4

References:
[1] Profiling with JProfiler, (Jan. 26, 2018). Accessed: Sep. 24, 2023. [Online Video]. Available: https://www.youtube.com/watch?v=LiiZnYbcliw
[2] JProfiler’s integration into IntelliJ IDEA, (Mar. 23, 2017). Accessed: Sep. 24, 2023. [Online Video]. Available: https://www.youtube.com/watch?v=XTq1VWEDygg
[3] “ArrayList in Java,” GeeksforGeeks, Oct. 06, 2016. https://www.geeksforgeeks.org/arraylist-in-java/ (accessed Sep. 24, 2023).
[4] “Generating random numbers in Java,” GeeksforGeeks, Oct. 26, 2016. https://www.geeksforgeeks.org/generating-random-numbers-in-java/ (accessed Sep. 24, 2023).
[5] “ArrayList and LinkedList remove() methods in Java with Examples,” GeeksforGeeks, Nov. 06, 2016. https://www.geeksforgeeks.org/arraylist-linkedlist-remove-methods-java-examples/ (accessed Sep. 24, 2023).
[6] codebox, “Answer to ‘Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException: 1000000 at problem2.main(problem2.java:17),’” Stack Overflow, Aug. 17, 2012. https://stackoverflow.com/a/12005428 (accessed Sep. 24, 2023).
[7] “LinkedList element() method in Java with Examples,” GeeksforGeeks, Oct. 11, 2018. https://www.geeksforgeeks.org/linkedlist-element-method-in-java-with-examples/ (accessed Sep. 24, 2023).
[8] “Hashtable in Java,” GeeksforGeeks, Jun. 14, 2017. https://www.geeksforgeeks.org/hashtable-in-java/ (accessed Sep. 24, 2023).
[9] “How do I declare and use a global variable in Java? • GITNUX.” https://blog.gitnux.com/code/java-global-variable/ (accessed Sep. 24, 2023).

*/