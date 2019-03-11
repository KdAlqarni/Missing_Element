/**
 * Created by khalid on 2/6/19.
 */

import java.io.*; 
import java.util.Scanner;

public class missing_element {
    public static void main(String[] args) throws Exception {
        System.out.printf("\nThis program will find the missing element/s in the First_Array but NOT in the Second_Array\n");
        int [] array1 = {21, 5, 4, 61, 1, 76};
        int [] array2 = {21, 65, 3, 1};
        System.out.printf("The two arrays are:\n\nFirst_Array: [");
        for (int elem : array1) {
            System.out.printf("%d, ",elem);
        }
        System.out.printf("]\n");
        
        System.out.printf("Second_Array: [");
        for (int elem : array2) {
            System.out.printf("%d, ",elem);
        }
        System.out.printf("]\n");
        find_element(array1, array2);

    }

    public static void find_element(int[] arr1, int[] arr2) {
        int count = 0;
        for (int var : arr1) {
            boolean notMissing = false;
            for (int var2 : arr2){
                if (var == var2){
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
