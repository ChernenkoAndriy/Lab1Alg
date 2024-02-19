public class ArrayManager {

    public static  <T> T[] addToAr(T[] t, T ob) {
        T[] arr = (T[]) new Object [t.length + 1];
        System.arraycopy(t, 0, arr, 0, t.length);
        arr[arr.length - 1] = ob;
        return arr;
    }


    public static <T> T[] delFromArr(T[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Create a new array with one less element
        T[] result = (T[]) new Object[arr.length - 1];

        // Copy elements before the specified index
        System.arraycopy(arr, 0, result, 0, index);

        // Copy elements after the specified index
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);

        return result;
    }
    public static <T> T getfromArray(T[] t, int i){
        return t[i];
    }
    public static <T> T[] setElArray(T[] t, int i,T t1){
        t[i] = t1;
        return  t;
    }
}

