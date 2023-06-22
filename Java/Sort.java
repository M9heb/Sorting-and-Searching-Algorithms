
public class Sort {
    void bubbleSort(int[] array) {
        // Psueducode:
        // Iterate through entire array
        // compare the "i" element with the next element
        // if array[i] is bigger then array [i+1], swap
        boolean isSorted = false;
        for (int i = 0; i < array.length && !isSorted; i++) {
            isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    isSorted = false;
                    swap(array, j, j + 1);
                }

            }
        }
    }

    void selectionSort(int[] array) {
        // Psueducode:
        // iterate through all items
        // set the current element as the smallest one
        // compare all the next elements with the smallest element
        // if an element was smaller than the smallest one, swap them

        for (int i = 0; i < array.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex])
                    smallestIndex = j;
            }
            swap(array, smallestIndex, i);
        }
    }

    void insertionSort(int[] array) {
        // Psueducode:
        // iterate through all items
        // choose each item and compare it with the previous sorted elements
        // find it's right position
        // shift all the items after it to the right
        // then put it there
        for (int i = 0; i < array.length; i++) {
            int selectedItemIndex = i;
            int selectedPlace = i;
            for (int j = selectedItemIndex - 1; j >= 0; i--) {
                if (array[j] > array[selectedItemIndex])
                    array[j + 1] = array[j];
                else {
                    selectedPlace = j + 1;
                    break;
                }
            }
            swap(array, selectedItemIndex, selectedPlace);

        }
    }

    void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int startIndex, int endIndex) {
        // Psueducode:
        // find the middle index
        // divide current in to two parts using middle index as the boundry
        // give each part to mergeSort method
        // give both part to the merge method
        if (startIndex < endIndex) {

            int middleIndex = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, middleIndex);
            mergeSort(array, middleIndex + 1, endIndex);

            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    private void merge(int[] array, int startIndex, int middleIndex, int endIndex) {
        // Psueducode:
        // make 3 pointers for the main array, left array and right array
        // put the smallest numbers from the left and right array to the main array
        int i = startIndex, j = middleIndex + 1, k = startIndex;
        int[] temp = new int[array.length];

        while (i <= middleIndex && j <= endIndex) {
            if (array[i] <= array[j])
                temp[k++] = array[i++];
            else
                temp[k++] = array[j++];
        }
        while (i <= middleIndex) {
            temp[k++] = array[i++];
        }
        while (j <= endIndex) {
            temp[k++] = array[j++];
        }
        for (int x = startIndex; x <= endIndex; x++)
            array[x] = temp[x];
    }

    void quickSort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;
        int boundary = partition(array, startIndex, endIndex);
        // Sort left
        quickSort(array, startIndex, boundary - 1);
        quickSort(array, boundary + 1, endIndex);
        // Sort right
    }

    private int partition(int[] array, int startindex, int endIndex) {
        int pivot = array[endIndex];
        int boundary = startindex - 1;
        for (int i = startindex; i <= endIndex; i++)
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        return boundary;

    }

    // Helper methods
    void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}