package sel.edu.FinalCourseTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

        Set<Integer> set = new HashSet<>(array.length);

        for (int a : array) {
            if (!set.add(a))
                return true;
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
