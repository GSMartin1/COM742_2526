public class Question3 {
    public static void main(String[] args) {
        Integer[] intArr = {1, 5, 3, 9, 2};
        String[] strArr = {"Apple", "Pear", "Banana"};
        Double[] dblArr = {2.5, 9.1, 8.4};

        System.out.println("Max Int: " + GenericUtils.findMax(intArr));
        System.out.println("Max String: " + GenericUtils.findMax(strArr));
        System.out.println("Max Double: " + GenericUtils.findMax(dblArr));
    }
}

class GenericUtils {
    // <T extends Comparable<T>> means T must be a type that can compare itself (like numbers/strings)
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) return null;

        T max = array[0];
        for (T item : array) {
            // item.compareTo(max) > 0 means item is larger than max
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
