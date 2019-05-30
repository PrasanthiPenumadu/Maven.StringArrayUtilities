package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {

    public static String getFirstElement(String[] array) {
        return array[0];
    }


    public static String getSecondElement(String[] array) {
        return array[1];
    }


    public static String getLastElement(String[] array) {
        return array[array.length];
    }


    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 1];
    }


    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value))
                return true;
        }
        return false;
    }


    public static String[] reverse(String[] array) {

        String[] rev = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            rev[j] = array[i];
            j++;
        }
        return rev;
    }

    public static boolean isPalindromic(String[] array) {
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            if ((array[i] == array[j]))
                return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String res = String.join(",", array);
        res = res.toLowerCase();
        System.out.println(res);
        boolean op = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!res.contains(String.valueOf(c)))
                op = false;
            break;
        }
        return op;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] array1 = new String[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (!array[i].equals(valueToRemove)) {
                array1[j] = array[i];
                j++;
            }
        }
        return array1;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> array1 = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] == array[i + 1])) {

                array1.add(array[i]);
            }
        }
        array1.add(array[array.length - 1]);
        System.out.println(array1);
        String arr[] = new String[array1.size()];
        for (int i = 0; i < array1.size(); i++)
            arr[i] = array1.get(i);

        return arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> array1 = new ArrayList<>();
        String x = array[0];
        for (int i = 0; i < array.length-1; i++) {
                if (array[i] != array[i + 1]) {
                    array1.add(x);
                    x = array[i + 1];
                }
                if (array[i] == array[i + 1]) {
                    x = x + array[i + 1];
                }
            }  array1.add(x);
        System.out.println(array1);
        String arr[] = new String[array1.size()];
        for (int i = 0; i < array1.size(); i++) {
            arr[i] = array1.get(i);
        }
        return arr;
    }
}




