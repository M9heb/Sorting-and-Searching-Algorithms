
public class Sort {
    public void bubbleSort(int[] array, int order) {
        /*
         * This method can only sort integers, so please insert integers for this
         * method.
         * Arguments: An array, the order you want to sort (0 for Ascending, 1 for
         * Descending)
         */
        if (order == 0) {

            boolean isSorted;
            for (int i = 0; i < array.length - 1; i++) {
                isSorted = true;
                for (int j = 0; j < array.length - (i + 1); j++) {
                    if (array[j] > array[j + 1]) {
                        swap(array, j, j + 1);
                        isSorted = false;
                    }

                }
                if (isSorted)
                    return;
            }
        } else if (order == 1) {
            boolean isSorted;
            for (int i = 0; i < array.length; i++) {
                isSorted = true;
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j] > array[j - 1]) {
                        swap(array, j, j - 1);
                        isSorted = false;
                    }

                }
                if (isSorted)
                    return;
            }
        } else
            throw new IllegalArgumentException();

    }

    public void selectionSort(int[] array, int order) {
        /*
         * This method can only sort integers, so please insert integers for this
         * method.
         * Arguments: An array, the order you want to sort (0 for Ascending, 1 for
         * Descending)
         */
        if (order == 0) {

            for (int i = 0; i < array.length; i++) {
                int indexOfMin = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < array[indexOfMin])
                        indexOfMin = j;
                }
                if (i != indexOfMin)
                    swap(array, i, indexOfMin);
            }
        } else if (order == 1) {
            for (int i = 0; i < array.length; i++) {
                int indexOfMax = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > array[indexOfMax])
                        indexOfMax = j;
                }
                if (i != indexOfMax)
                    swap(array, i, indexOfMax);
            }
        }

    }

    private void swap(int array[], int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}