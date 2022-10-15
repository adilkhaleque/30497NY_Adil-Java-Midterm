package data_structures;

import databases.SharedStepsDatabase;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) throws Exception{

        Queue<Object> numbers = new ArrayDeque<>();

        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        System.out.println();

        for (Object n : numbers) {
            System.out.println(n);
        }

        numbers.remove(5);
        System.out.println(numbers);

        System.out.println(numbers.peek());

        System.out.println(numbers.poll());
        System.out.println(numbers);
        System.out.println(numbers.poll());
        System.out.println(numbers);
        System.out.println();

        Iterator<Object> myIterator1 = numbers.iterator();

        while (myIterator1.hasNext()) {
            System.out.println(myIterator1.next());
        }

        SharedStepsDatabase ssdb = new SharedStepsDatabase();
        ssdb.insertQueue("Queue_Example", "queue_numbers", numbers);
        String queueQuery = "SELECT * FROM Queue_Example";

        List<String> results = ssdb.executeQueryReadAllSingleColumn(queueQuery, "queue_numbers");

        for (String queueResults: results) {
            System.out.println(queueResults);
        }
    }

}
