/**
 * Created by khalid on 2/6/19.
 */

import java.io.*; 
import java.util.Scanner;

public class missing_element {
    public static void main(String[] args) throws Exception {
        System.out.printf("\nThis program will find the missing element/s that in the First_Array, but NOT\nin the Second_Array\n");
        int [] array1 = {21, 65, 3, 61, 1, 76};
        int [] array2 = {21, 65, 3, 1};
        System.out.println("The two arrays are:\n\nFirst_Array[21, 65, 3, 61, 1, 76]\nSecond_Array[21, 65, 3, 1]");
	find_element(array1, array2);
    }
    public static void find_element(int[] arr1, int[] arr2) {
        int count = 0;
        for (int var : arr1) {
            boolean notMissing = false;
            for (int var2 : arr2){
                // TODO
                if (var == var2) {
                    notMissing = true;
                }
            }
            if(notMissing == false){
                System.out.println("Number " + var + " is Missing.");
                count ++ ;
            } 
        }
        if (count == 0) {
            System.out.println("No number is missing!");
        }
    }  
}
