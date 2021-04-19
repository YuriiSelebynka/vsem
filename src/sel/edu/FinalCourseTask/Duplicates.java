package sel.edu.FinalCourseTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Yurii Selebynka
 * @project vsem
 * @class Duplicates
 * @version 1.0.0
 * @since 19.04.21 - 20, 08
 * */

public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        List<Integer> list = Arrays.stream(array).boxed()
                .distinct().collect(Collectors.toList());
        int[] arr2 = new int[list.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) list.get(i);
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;

        System.out.println(hasDuplicates(array)); // true

    }
}
