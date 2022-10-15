package math_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};

        lowestNumber(array1, array2);
    }

    public static void lowestNumber(int[] array1, int[] array2) {

//        Arrays.sort(array1);
//        Arrays.sort(array2);

        List<Integer> myList = new ArrayList<>();

//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i] != array2[j]) {
//                    if (array1[i] < array2[j]) {
//                        myList.add(array1[i]);
//                        break;
//                    }
//                    else if (array2[j] < array1[i]) {
//                        myList.add(array2[j]);
//                        break;
//                    }
//                }
//            }
//        }
//        //Collections.sort(myList);
//        System.out.println(myList.get(0));

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                myList.add(array1[i]);
            }
        }
        for (int j = 0; j < array2.length; j++) {
            if (array1[j] != array2[j]) {
                myList.add(array2[j]);
            }
        }
        Collections.sort(myList);
        System.out.println(myList.get(0));
    }
}
