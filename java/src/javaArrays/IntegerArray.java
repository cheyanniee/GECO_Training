package javaArrays;

public class IntegerArray {
    /*
    Create java class
    declare the int global varable .
    access the global variable in the main func by creating object
    if( value > 10){//op as num is greater 10}
    Else{/op as num is lesser 10}
*/
    int[] int_array = {-27, -3, 0, 5, 28, 40, 70, 124};

    public static void main(String[] args) {
        IntegerArray int_arr = new IntegerArray();

        for (int num : int_arr.int_array) {
            if (num > 10) {
                System.out.printf("%d is greater than 10 %n", num);
            } else {
                System.out.printf("%d is smaller than 10 %n", num);
            }
        }
    }
}
