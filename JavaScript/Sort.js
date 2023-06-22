function bubbleSort(array, order) {
  if (order === 0) {
    let isSorted;
    for (let i = 0; i < array.length - 1; i++) {
      isSorted = true;
      for (let j = 0; j < array.length - (i + 1); j++) {
        if (array[j] > array[j + 1]) {
          swap(array, j, j + 1);
          isSorted = false;
        }
      }
      if (isSorted) return;
    }
  } else if (order === 1) {
    let isSorted;
    for (let i = 0; i < array.length; i++) {
      isSorted = true;
      for (let j = array.length - 1; j > i; j--) {
        if (array[j] > array[j - 1]) {
          swap(array, j, j - 1);
          isSorted = false;
        }
      }
      if (isSorted) return;
    }
  }
}

function insertionSort(array) {
  for (let i = 1; i < array.lenght; i++) {
    let current = array[i];
    let currentPlace = i;
    for (let j = i - 1; j >= 0 && array[j] > current; j--) {
      currentPlace = j;
    }
    array[currentPlace] = current;
  }
}

function swap(array, index1, index2) {
  let temp = array[index1];
  array[index1] = array[index2];
  array[index2] = temp;
}
