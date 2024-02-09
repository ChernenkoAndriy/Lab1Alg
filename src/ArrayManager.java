import java.util.Arrays;

/**
 * The ArrayManager class provides methods for manipulating arrays.
 */
public class ArrayManager {

    public ArrayManager() {
    }

    /**
     * Adds an object to the end of the array.
     *
     * @param obj The original array.
     * @param ob  The object to be added to the array.
     */
    public void addToAr(Object[] obj, Object ob) {
        // Create a new array with increased size
        Object[] arr = new Object[obj.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < obj.length; i++) {
            arr[i] = obj[i];
        }

        // Add the new object to the end of the array
        arr[arr.length - 1] = ob;

        // Update the reference to the original array
        obj = arr;
    }

    /**
     * Deletes an element from the array based on its position.
     *
     * @param obj    The original array.
     * @param place  The position of the element to be deleted.
     */
    public void delFromAr(Object[] obj, int place) {
        // Create a new array with decreased size
        Object[] arr = new Object[obj.length - 1];

        // Copy elements from the original array to the new array, excluding the specified position
        for (int i = 0, j = 0; i < obj.length; i++) {
            if (i == place) {
                continue; // Skip the element at the specified position
            }
            arr[j++] = obj[i];
        }

        // Update the reference to the original array
        obj = arr;
    }
}

