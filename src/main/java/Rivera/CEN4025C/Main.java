package Rivera.CEN4025C;

/*
Instructions:

After viewing the tutorials mentioned in the Learning Materials page on JProfiler. Use it to profile the following program:
Description:

Write a Java application that does the following. The Main method should:

Call a new method which adds 2,000,000 random integers into an ArrayList, then deletes each one from the ArrayList

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
import java.util.Random;

//Prerequisites: Before writing the code below, I installed JProfiler 14.0 as discussed in the Profiling with JProfiler [1] and JProfiler’s integration into IntelliJ IDEA [2] videos.
public class Main {
    public static void main(String[] args)
    {
        //New upper limit integer variable for data structures
        int numLimit = 2000000;

        //New method for random integers
        Random randNum = new Random();
        //Reference [4]

        //New method for ArrayList
        //Declaring the ArrayList
        ArrayList<Integer> myArray = new ArrayList<Integer>();

        //Appending new elements at the end of the list
        for (int i = 0; i <= numLimit; i++)
        {
            myArray.add(randNum.nextInt());
            System.out.println(myArray); //Simple test to check for array population.
        }
        //Reference [3],[4]

        //New method for LinkedList

        //New method for Hashtable

    }
}



/*

GitHub:
Link pending.

References:
[1] Profiling with JProfiler, (Jan. 26, 2018). Accessed: Sep. 24, 2023. [Online Video]. Available: https://www.youtube.com/watch?v=LiiZnYbcliw
[2] JProfiler’s integration into IntelliJ IDEA, (Mar. 23, 2017). Accessed: Sep. 24, 2023. [Online Video]. Available: https://www.youtube.com/watch?v=XTq1VWEDygg
[3] “ArrayList in Java,” GeeksforGeeks, Oct. 06, 2016. https://www.geeksforgeeks.org/arraylist-in-java/ (accessed Sep. 24, 2023).
[4] “Generating random numbers in Java,” GeeksforGeeks, Oct. 26, 2016. https://www.geeksforgeeks.org/generating-random-numbers-in-java/ (accessed Sep. 24, 2023).

*/