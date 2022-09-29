package javaArrays;

public class StringLongArray {
    /*
        Create java class
        declare the string  global array and long array
        access the global variable in the main func by creating object
        iterate the global arrays and show the o/p
    */

    String[] str_array = {"Hello", "World", "Java"};
    long[] long_array = {111111111, 222222222, 333333333};

    public static void main(String[] args) {
        StringLongArray str_long = new StringLongArray();

        System.out.printf("String Array Elements: %n");
        for (String str : str_long.str_array) {
            System.out.printf("%s %n", str);
        }

        System.out.println();

        System.out.printf("Long Array Elements: %n");
        for (long lg : str_long.long_array) {
            System.out.printf("%d %n", lg);
        }
    }
}
