package Module_1_Arr;

import java.util.ArrayList;
import java.util.Arrays;

public class AddName {
    public static ArrayList<String> names = new ArrayList<>();

    public static void addName(String name) {
        names.add(name);
    }

    public static String[] concatArr() {
        return names.toArray(new String[0]);
    }

    public static void main(String[] args) {
        /*
        Create a list of names and add 5 names.
         */
        addName("Ivan");
        addName("Luis");
        addName("Leonardo");
        addName("Julio");
        addName("Sebastian");

        String[] namesArray = concatArr();
        System.out.println(Arrays.toString(namesArray));
    }
}
