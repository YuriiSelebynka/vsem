package sel.edu.FinalCourseTask;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class RightShift
 * @version 1.0.0
 * @since 19.04.21 - 19, 15
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RightShift {
    public static int[] rightShift(int[] array, int step){

        for(int i = 0; i < step; i++){
            int j, last;
            last = array[array.length-1];

            for(j = array.length-1; j > 0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};


        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}
