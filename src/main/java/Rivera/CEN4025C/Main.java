package Rivera.CEN4025C;

/*
Instructions:

After viewing the tutorials mentioned in the Learning Materials page on JProfiler. Use it to profile the following program:
Description:

Write a Java application that does the following. The Main method should:

Call a new method which adds 2,000,000 random integers into an ArrayList, then deletes each one from the ArrayList (Done)

Call a new method which adds 2,000,000 random integers into a LinkedList, then deletes each one from the LinkedList

Call a new method which adds 2,000,000 random integers into a Hashtable, then deletes each one from the Hashtable
Help with Assignment:

See our free Valencia tutoring option: Tutoring Options
Submission:

PDF document.  This PDF will contain your source code and a couple of screen shots showing your program in action pasted into the document.

The screen shots of the profiler will include, showing the relative performance of each of the collection classes

You will have to include the answer this question: Which method had the longest runtime?

 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

//Prerequisites: Before writing the code below, I installed JProfiler 14.0 as discussed in the Profiling with JProfiler [1] and JProfiler’s integration into IntelliJ IDEA [2] videos.
public class Main {
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
        int numLimit = 2000;

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
        //FIXME - reduced numLimit from 2000000 to 2000 for troubleshooting.

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
        int numLimit = 2000;

        //Appending new elements at the end of the list
        for (int i = 0; i < numLimit; i++) {
            myLinkedList.add(randNum.nextInt());
            //System.out.println("Index: " + i + " Int value added" + " " + "Array size: " + myLinkedList.size()); //Simple test to check for array population. Array list populates to 2mil.
        }
        //Reference [4],[7]

        //Deleting elements of the ArrayList
        for (int i = numLimit - 1; myLinkedList.size() > 0; i--) {
            myLinkedList.remove(i);
            System.out.println("Index: " + i + " | Int value removed" + " | LinkedList size: " + myLinkedList.size() + " | LinkedList value: " + myLinkedList); //Simple test to check for array value deletion.
        }
        //Reference [5]
    }

    public static void hashtableMethod() {
        System.out.println("Sample code.");
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

*/