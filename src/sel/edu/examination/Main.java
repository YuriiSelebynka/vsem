package sel.edu.examination;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static int[] deleteDuplicates(int[] array ) {
        // your code is here
        // у цьому блоці треба писати свій код. Нижче - приклад.
        List<Integer> list = Arrays.stream(array).boxed()
                .distinct().collect(Collectors.toList());
        int[] arr2 = new int[list.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) list.get(i);
        }
        return arr2;
    }

    public static void main(String[] args) {
      int[] array = {1, 6, 9, 5, 6};
        System.out.println(deleteDuplicates(array)); // [1, 6, 9, 5]
        System.out.println(Arrays.toString(deleteDuplicates(array)));
    }
}
