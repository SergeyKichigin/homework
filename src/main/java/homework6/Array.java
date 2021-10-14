package homework6;

import java.util.Arrays;

public class Array {

    public static int[] changeArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("4 not found");
    }

    public static boolean checkArray(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length; i++) {
            switch(arr[i]) {
                case 1: count1++;
                    break;
                case 4: count2++;
                    break;
                default:
                    return false;
            }
        }
        if (count1 > 0 && count2 > 0) {
            return true;
        } else { return false; }
    }
}

