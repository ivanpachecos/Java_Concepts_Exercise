package Module_1_Arr;

import java.util.Arrays;

public class ModifyElements {
    public static void main(String[] args) {
        /*
        Modify the third element of the array.
         */
        int[] names = {23, 2, 3, 4, 5};
        int newElement = 22;
        for (int i = 0; i < names.length; i++) {
            if (i == 3) {
                names[i] = newElement;
            }
        }
        System.out.println("EL arr modified = " + Arrays.toString(names));
    }
}
