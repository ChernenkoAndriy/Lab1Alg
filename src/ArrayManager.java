import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * The ArrayManager class provides utility methods for managing arrays in Java.
 * It includes methods for adding elements, deleting elements, retrieving elements,
 * updating elements, and checking if an element is present in the array.
 *
 */
public class ArrayManager {

    /**
     * Adds a new element to the end of the array.
     *
     * @param t  The original array.
     * @param ob The element to be added.
     * @param <T> The type of elements in the array.
     * @return A new array with the added element.
     */
    public static <T> T[] addToAr(T[] t, T ob) {
        T[] arr = Arrays.copyOf(t, t.length + 1);
        arr[arr.length - 1] = ob;
        return arr;
    }


    /**
     * Deletes an element from the array at the specified index.
     *
     * @param arr   The original array.
     * @param index The index of the element to be deleted.
     * @param <T>   The type of elements in the array.
     * @return A new array with the specified element removed.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public static <T> T[] delFromArr(T[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Create a new array with one less element
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(arr.getClass().getComponentType(), arr.length - 1);

        // Copy elements before the specified index
        System.arraycopy(arr, 0, result, 0, index);

        // Copy elements after the specified index
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);

        return result;
    }

    /**
     * Retrieves an element from the array at the specified index.
     *
     * @param t   The array.
     * @param i   The index of the element to be retrieved.
     * @param <T> The type of elements in the array.
     * @return The element at the specified index.
     */
    public static <T> T getfromArray(T[] t, int i){
        return t[i];
    }

    /**
     * Updates an element in the array at the specified index.
     *
     * @param t   The original array.
     * @param i   The index of the element to be updated.
     * @param t1  The new value for the element.
     * @param <T> The type of elements in the array.
     * @return The array with the specified element updated.
     */
    public static <T> T[] setElArray(T[] t, int i, T t1){
        t[i] = t1;
        return  t;
    }

    /**
     * Checks if the array contains a specific element.
     *
     * @param t The array to be checked.
     * @param k The element to be checked for existence.
     * @param <T> The type of elements in the array.
     * @return true if the element is present, false otherwise.
     */
    public static <T> boolean ifContains(T[] t, T k){
        for(T j : t){
            if(k.equals(j)) return true;
        }
        return false;
    }

    public static <T> void print(T[] t){
        for (T k : t)
            System.out.println(k);
    }
}


