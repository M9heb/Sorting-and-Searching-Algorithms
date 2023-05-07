
public class Search {
    public int linearSearch(int[] array, int item) {
        /*
         * This is the linearSearch algorithm of finding an integer in an array.
         */
        for (int i = 0; i < array.length; i++)
            if (item == array[i])
                return i;

        return -1;
    }

    public int binarySearch(int[] array, int item) {
        /*
         * This is the binarySearch algorithm of finding an integer in an array.
         */
        int left = 0;
        int right = array.length - 1;

        while (right >= left) {
            int midIndex = (left + right) / 2;
            if (item == array[midIndex])
                return midIndex;
            else if (item >= array[midIndex])
                left = midIndex + 1;
            else if (item <= array[midIndex])
                right = midIndex - 1;
        }
        return -1;
    }
}
