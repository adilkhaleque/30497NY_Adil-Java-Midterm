package data_structures;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    /** INSTRUCTIONS
     *
     * Create an API to read the .txt file and print it to the console.
     *      HINT: Use BufferedReader class
     * Use try-catch block to handle any exceptions
     *
     * Store and retrieve the file to/from a database table.
     *
     * After reading from file using BufferedReader API, store each word, first into a LinkedList. Each word
     * should construct a node in LinkedList. Second, do the same, but with a Stack.
     * Finally, traverse through the list\stack & retrieve each item in `FIFO` order and `FILO` order, respectively
     *
     * Demonstrate how to use a stack using push, peek, search & pop methods.
     * Use For-Each & While-loop with Iterator to retrieve/print data.
     **/

    public static void main(String[] args) {
        //String textFilePath = System.getProperty("user.dir") + "/src/data_structures/data/self-driving-car.txt";
        String textFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator +
                "data_structures" + File.separator + "data" + File.separator + "self-driving-car.txt";

        File file = new File(textFilePath);

        try (FileInputStream fis = new FileInputStream(file);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)){

            String line;

            LinkedList<String> myLL = new LinkedList<>();
            Stack<String> myStack = new Stack<>();

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                myLL.addAll(Arrays.asList(words));
                myStack.addAll(Arrays.asList(words));
            }

            Iterator<String> myIterator1 = myLL.iterator();
            while (myIterator1.hasNext()) {
                System.out.println(myIterator1.next());
            }

            Iterator<String> myIterator2 = myStack.iterator();
            while (myIterator2.hasNext()) {
                System.out.println(myIterator2.next());
            }

        } catch (FileNotFoundException e) {
            System.out.println("NO FILE EXISTS AT THE PROVIDED PATH!");
        } catch (IOException e) {
            System.out.println("COULD NOT READ FROM FILE. PLEASE CHECK YOUR FILE IS NOT CORRUPTED");
        }
    }



}
